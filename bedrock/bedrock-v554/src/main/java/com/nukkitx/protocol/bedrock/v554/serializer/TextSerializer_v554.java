package com.nukkitx.protocol.bedrock.v554.serializer;

import com.nukkitx.protocol.bedrock.BedrockPacketHelper;
import com.nukkitx.protocol.bedrock.packet.TextPacket;
import com.nukkitx.protocol.bedrock.v332.serializer.TextSerializer_v332;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TextSerializer_v554 extends TextSerializer_v332 {

    public static final TextSerializer_v554 INSTANCE = new TextSerializer_v554();

    @Override
    public void serialize(ByteBuf buffer, BedrockPacketHelper helper, TextPacket packet) {
        TextPacket.Type type = packet.getType();
        buffer.writeByte(type.ordinal());
        buffer.writeBoolean(packet.isNeedsTranslation());

        switch (type) {
            case CHAT:
            case WHISPER:
            case ANNOUNCEMENT:
                helper.writeString(buffer, packet.getSourceName());
            case RAW:
            case TIP:
            case SYSTEM:
            case OBJECT:
            case OBJECT_WHISPER:
            case OBJECT_ANNOUNCEMENT:
                helper.writeString(buffer, packet.getMessage());
                break;
            case TRANSLATION:
            case POPUP:
            case JUKEBOX_POPUP:
                helper.writeString(buffer, packet.getMessage());
                helper.writeArray(buffer, packet.getParameters(), helper::writeString);
                break;
            default:
                throw new UnsupportedOperationException("Unsupported TextType " + type);
        }

        helper.writeString(buffer, packet.getXuid());
        helper.writeString(buffer, packet.getPlatformChatId());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockPacketHelper helper, TextPacket packet) {
        TextPacket.Type type = TextPacket.Type.values()[buffer.readUnsignedByte()];
        packet.setType(type);
        packet.setNeedsTranslation(buffer.readBoolean());

        switch (type) {
            case CHAT:
            case WHISPER:
            case ANNOUNCEMENT:
                packet.setSourceName(helper.readString(buffer));
            case RAW:
            case TIP:
            case SYSTEM:
            case OBJECT:
            case OBJECT_WHISPER:
            case OBJECT_ANNOUNCEMENT:
                packet.setMessage(helper.readString(buffer));
                break;
            case TRANSLATION:
            case POPUP:
            case JUKEBOX_POPUP:
                packet.setMessage(helper.readString(buffer));
                helper.readArray(buffer, packet.getParameters(), helper::readString);
                break;
            default:
                throw new UnsupportedOperationException("Unsupported TextType " + type);
        }

        packet.setXuid(helper.readString(buffer));
        packet.setPlatformChatId(helper.readString(buffer));
    }
}
