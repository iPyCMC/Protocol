package com.nukkitx.protocol.bedrock.v630;

import com.nukkitx.protocol.bedrock.BedrockPacketCodec;
import com.nukkitx.protocol.bedrock.packet.*;
import com.nukkitx.protocol.bedrock.v291.serializer.*;
import com.nukkitx.protocol.bedrock.v313.serializer.AvailableEntityIdentifiersSerializer_v313;
import com.nukkitx.protocol.bedrock.v313.serializer.BiomeDefinitionListSerializer_v313;
import com.nukkitx.protocol.bedrock.v332.serializer.NetworkStackLatencySerializer_v332;
import com.nukkitx.protocol.bedrock.v354.serializer.LecternUpdateSerializer_v354;
import com.nukkitx.protocol.bedrock.v354.serializer.MapCreateLockedCopySerializer_v354;
import com.nukkitx.protocol.bedrock.v354.serializer.OnScreenTextureAnimationSerializer_v354;
import com.nukkitx.protocol.bedrock.v354.serializer.UpdateTradeSerializer_v354;
import com.nukkitx.protocol.bedrock.v361.serializer.*;
import com.nukkitx.protocol.bedrock.v388.serializer.*;
import com.nukkitx.protocol.bedrock.v390.serializer.PlayerListSerializer_v390;
import com.nukkitx.protocol.bedrock.v390.serializer.PlayerSkinSerializer_v390;
import com.nukkitx.protocol.bedrock.v407.serializer.*;
import com.nukkitx.protocol.bedrock.v419.serializer.*;
import com.nukkitx.protocol.bedrock.v422.serializer.FilterTextSerializer_v422;
import com.nukkitx.protocol.bedrock.v428.serializer.CameraShakeSerializer_v428;
import com.nukkitx.protocol.bedrock.v428.serializer.ClientboundDebugRendererSerializer_v428;
import com.nukkitx.protocol.bedrock.v428.serializer.ItemStackResponseSerializer_v428;
import com.nukkitx.protocol.bedrock.v440.serializer.SyncEntityPropertySerializer_v440;
import com.nukkitx.protocol.bedrock.v448.serializer.NpcDialogueSerializer_v448;
import com.nukkitx.protocol.bedrock.v448.serializer.NpcRequestSerializer_v448;
import com.nukkitx.protocol.bedrock.v448.serializer.SetTitleSerializer_v448;
import com.nukkitx.protocol.bedrock.v448.serializer.SimulationTypeSerializer_v448;
import com.nukkitx.protocol.bedrock.v465.serializer.*;
import com.nukkitx.protocol.bedrock.v471.serializer.PhotoInfoRequestSerializer_v471;
import com.nukkitx.protocol.bedrock.v486.serializer.*;
import com.nukkitx.protocol.bedrock.v503.serializer.*;
import com.nukkitx.protocol.bedrock.v527.serializer.LessonProgressSerializer_v527;
import com.nukkitx.protocol.bedrock.v527.serializer.PlayerActionSerializer_v527;
import com.nukkitx.protocol.bedrock.v527.serializer.RequestPermissionsSerializer_v527;
import com.nukkitx.protocol.bedrock.v527.serializer.ToastRequestSerializer_v527;
import com.nukkitx.protocol.bedrock.v534.serializer.DeathInfoSerializer_v534;
import com.nukkitx.protocol.bedrock.v534.serializer.EditorNetworkSerializer_v534;
import com.nukkitx.protocol.bedrock.v534.serializer.UpdateAbilitiesSerializer_v534;
import com.nukkitx.protocol.bedrock.v534.serializer.UpdateAdventureSettingsSerializer_v534;
import com.nukkitx.protocol.bedrock.v544.serializer.*;
import com.nukkitx.protocol.bedrock.v554.serializer.*;
import com.nukkitx.protocol.bedrock.v557.serializer.AddEntitySerializer_v557;
import com.nukkitx.protocol.bedrock.v557.serializer.AddPlayerSerializer_v557;
import com.nukkitx.protocol.bedrock.v557.serializer.SetEntityDataSerializer_v557;
import com.nukkitx.protocol.bedrock.v560.serializer.UpdateClientInputLocksSerializer_v560;
import com.nukkitx.protocol.bedrock.v567.serializer.ClientCheatAbilitySerializer_v567;
import com.nukkitx.protocol.bedrock.v567.serializer.CommandRequestSerializer_v567;
import com.nukkitx.protocol.bedrock.v567.serializer.CraftingDataSerializer_v567;
import com.nukkitx.protocol.bedrock.v575.serializer.PlayerAuthInputSerializer_v575;
import com.nukkitx.protocol.bedrock.v575.serializer.UnlockedRecipesSerializer_v575;
import com.nukkitx.protocol.bedrock.v582.serializer.CompressedBiomeDefinitionListSerializer_v582;
import com.nukkitx.protocol.bedrock.v582.serializer.OpenSignSerializer_v582;
import com.nukkitx.protocol.bedrock.v582.serializer.RequestChunkRadiusSerializer_v582;
import com.nukkitx.protocol.bedrock.v582.serializer.TrimDataSerializer_v582;
import com.nukkitx.protocol.bedrock.v589.serializer.EmoteSerializer_v589;
import com.nukkitx.protocol.bedrock.v589.serializer.EventSerializer_v589;
import com.nukkitx.protocol.bedrock.v589.serializer.StartGameSerializer_v589;
import com.nukkitx.protocol.bedrock.v594.serializer.AgentAnimationSerializer_v594;
import com.nukkitx.protocol.bedrock.v594.serializer.AvailableCommandsSerializer_v594;
import com.nukkitx.protocol.bedrock.v594.serializer.RequestAbilitySerializer_v594;
import com.nukkitx.protocol.bedrock.v618.serializer.CameraInstructionSerializer_v618;
import com.nukkitx.protocol.bedrock.v618.serializer.CameraPresetsSerializer_v618;
import com.nukkitx.protocol.bedrock.v618.serializer.ResourcePacksInfoSerializer_v618;
import com.nukkitx.protocol.bedrock.v622.serializer.DisconnectSerializer_v622;
import com.nukkitx.protocol.bedrock.v630.serializer.ServerPostMovePositionSerializer_v630;
import com.nukkitx.protocol.bedrock.v630.serializer.SetPlayerInventoryOptionsSerializer_v630;
import com.nukkitx.protocol.bedrock.v630.serializer.ShowStoreOfferSerializer_v630;
import com.nukkitx.protocol.bedrock.v630.serializer.ToggleCrafterSlotRequestSerializer_v630;
import lombok.experimental.UtilityClass;

/**
 * @author Kaooot
 * @version 1.0
 */
@UtilityClass
public class Bedrock_v630 {

    public static final BedrockPacketCodec V630_CODEC = BedrockPacketCodec.builder()
            .raknetProtocolVersion(11)
            .protocolVersion(630)
            .minecraftVersion("1.20.50")
            .helper(BedrockPacketHelper_v630.INSTANCE)
            .registerPacket(LoginPacket.class, LoginSerializer_v291.INSTANCE, 1)
            .registerPacket(PlayStatusPacket.class, PlayStatusSerializer_v291.INSTANCE, 2)
            .registerPacket(ServerToClientHandshakePacket.class, ServerToClientHandshakeSerializer_v291.INSTANCE, 3)
            .registerPacket(ClientToServerHandshakePacket.class, ClientToServerHandshakeSerializer_v291.INSTANCE, 4)
            .registerPacket(DisconnectPacket.class, DisconnectSerializer_v622.INSTANCE, 5)
            .registerPacket(ResourcePacksInfoPacket.class, ResourcePacksInfoSerializer_v618.INSTANCE, 6)
            .registerPacket(ResourcePackStackPacket.class, ResourcePackStackSerializer_v419.INSTANCE, 7)
            .registerPacket(ResourcePackClientResponsePacket.class, ResourcePackClientResponseSerializer_v291.INSTANCE, 8)
            .registerPacket(TextPacket.class, TextSerializer_v554.INSTANCE, 9)
            .registerPacket(SetTimePacket.class, SetTimeSerializer_v291.INSTANCE, 10)
            .registerPacket(StartGamePacket.class, StartGameSerializer_v589.INSTANCE, 11)
            .registerPacket(AddPlayerPacket.class, AddPlayerSerializer_v557.INSTANCE, 12)
            .registerPacket(AddEntityPacket.class, AddEntitySerializer_v557.INSTANCE, 13)
            .registerPacket(RemoveEntityPacket.class, RemoveEntitySerializer_v291.INSTANCE, 14)
            .registerPacket(AddItemEntityPacket.class, AddItemEntitySerializer_v291.INSTANCE, 15)
            .registerPacket(TakeItemEntityPacket.class, TakeItemEntitySerializer_v291.INSTANCE, 17)
            .registerPacket(MoveEntityAbsolutePacket.class, MoveEntityAbsoluteSerializer_v291.INSTANCE, 18)
            .registerPacket(MovePlayerPacket.class, MovePlayerSerializer_v419.INSTANCE, 19)
            .registerPacket(RiderJumpPacket.class, RiderJumpSerializer_v291.INSTANCE, 20)
            .registerPacket(UpdateBlockPacket.class, UpdateBlockSerializer_v291.INSTANCE, 21)
            .registerPacket(AddPaintingPacket.class, AddPaintingSerializer_v361.INSTANCE, 22)
            .registerPacket(TickSyncPacket.class, TickSyncSerializer_v388.INSTANCE, 23)
            .registerPacket(LevelSoundEvent1Packet.class, LevelSoundEvent1Serializer_v291.INSTANCE, 24)
            .registerPacket(LevelEventPacket.class, LevelEventSerializer_v291.INSTANCE, 25)
            .registerPacket(BlockEventPacket.class, BlockEventSerializer_v291.INSTANCE, 26)
            .registerPacket(EntityEventPacket.class, EntityEventSerializer_v291.INSTANCE, 27)
            .registerPacket(MobEffectPacket.class, MobEffectSerializer_v291.INSTANCE, 28)
            .registerPacket(UpdateAttributesPacket.class, UpdateAttributesSerializer_v544.INSTANCE, 29)
            .registerPacket(InventoryTransactionPacket.class, InventoryTransactionSerializer_v407.INSTANCE, 30)
            .registerPacket(MobEquipmentPacket.class, MobEquipmentSerializer_v291.INSTANCE, 31)
            .registerPacket(MobArmorEquipmentPacket.class, MobArmorEquipmentSerializer_v291.INSTANCE, 32)
            .registerPacket(InteractPacket.class, InteractSerializer_v388.INSTANCE, 33)
            .registerPacket(BlockPickRequestPacket.class, BlockPickRequestSerializer_v291.INSTANCE, 34)
            .registerPacket(EntityPickRequestPacket.class, EntityPickRequestSerializer_v465.INSTANCE, 35)
            .registerPacket(PlayerActionPacket.class, PlayerActionSerializer_v527.INSTANCE, 36)
            .registerPacket(EntityFallPacket.class, EntityFallSerializer_v291.INSTANCE, 37)
            .registerPacket(HurtArmorPacket.class, HurtArmorSerializer_v465.INSTANCE, 38)
            .registerPacket(SetEntityDataPacket.class, SetEntityDataSerializer_v557.INSTANCE, 39)
            .registerPacket(SetEntityMotionPacket.class, SetEntityMotionSerializer_v291.INSTANCE, 40)
            .registerPacket(SetEntityLinkPacket.class, SetEntityLinkSerializer_v291.INSTANCE, 41)
            .registerPacket(SetHealthPacket.class, SetHealthSerializer_v291.INSTANCE, 42)
            .registerPacket(SetSpawnPositionPacket.class, SetSpawnPositionSerializer_v407.INSTANCE, 43)
            .registerPacket(AnimatePacket.class, AnimateSerializer_v291.INSTANCE, 44)
            .registerPacket(RespawnPacket.class, RespawnSerializer_v388.INSTANCE, 45)
            .registerPacket(ContainerOpenPacket.class, ContainerOpenSerializer_v291.INSTANCE, 46)
            .registerPacket(ContainerClosePacket.class, ContainerCloseSerializer_v419.INSTANCE, 47)
            .registerPacket(PlayerHotbarPacket.class, PlayerHotbarSerializer_v291.INSTANCE, 48)
            .registerPacket(InventoryContentPacket.class, InventoryContentSerializer_v407.INSTANCE, 49)
            .registerPacket(InventorySlotPacket.class, InventorySlotSerializer_v407.INSTANCE, 50)
            .registerPacket(ContainerSetDataPacket.class, ContainerSetDataSerializer_v291.INSTANCE, 51)
            .registerPacket(CraftingDataPacket.class, CraftingDataSerializer_v567.INSTANCE, 52)
            .registerPacket(CraftingEventPacket.class, CraftingEventSerializer_v291.INSTANCE, 53)
            .registerPacket(GuiDataPickItemPacket.class, GuiDataPickItemSerializer_v291.INSTANCE, 54)
            .registerPacket(AdventureSettingsPacket.class, AdventureSettingsSerializer_v291.INSTANCE, 55)
            .registerPacket(BlockEntityDataPacket.class, BlockEntityDataSerializer_v291.INSTANCE, 56)
            .registerPacket(PlayerInputPacket.class, PlayerInputSerializer_v291.INSTANCE, 57)
            .registerPacket(LevelChunkPacket.class, LevelChunkSerializer_v486.INSTANCE, 58)
            .registerPacket(SetCommandsEnabledPacket.class, SetCommandsEnabledSerializer_v291.INSTANCE, 59)
            .registerPacket(SetDifficultyPacket.class, SetDifficultySerializer_v291.INSTANCE, 60)
            .registerPacket(ChangeDimensionPacket.class, ChangeDimensionSerializer_v291.INSTANCE, 61)
            .registerPacket(SetPlayerGameTypePacket.class, SetPlayerGameTypeSerializer_v291.INSTANCE, 62)
            .registerPacket(PlayerListPacket.class, PlayerListSerializer_v390.INSTANCE, 63)
            .registerPacket(SimpleEventPacket.class, SimpleEventSerializer_v291.INSTANCE, 64)
            .registerPacket(EventPacket.class, EventSerializer_v589.INSTANCE, 65)
            .registerPacket(SpawnExperienceOrbPacket.class, SpawnExperienceOrbSerializer_v291.INSTANCE, 66)
            .registerPacket(ClientboundMapItemDataPacket.class, ClientboundMapItemDataSerializer_v544.INSTANCE, 67)
            .registerPacket(MapInfoRequestPacket.class, MapInfoRequestSerializer_v544.INSTANCE, 68)
            .registerPacket(RequestChunkRadiusPacket.class, RequestChunkRadiusSerializer_v582.INSTANCE, 69)
            .registerPacket(ChunkRadiusUpdatedPacket.class, ChunkRadiusUpdatedSerializer_v291.INSTANCE, 70)
            .registerPacket(ItemFrameDropItemPacket.class, ItemFrameDropItemSerializer_v291.INSTANCE, 71)
            .registerPacket(GameRulesChangedPacket.class, GameRulesChangedSerializer_v291.INSTANCE, 72)
            .registerPacket(CameraPacket.class, CameraSerializer_v291.INSTANCE, 73)
            .registerPacket(BossEventPacket.class, BossEventSerializer_v486.INSTANCE, 74)
            .registerPacket(ShowCreditsPacket.class, ShowCreditsSerializer_v291.INSTANCE, 75)
            .registerPacket(AvailableCommandsPacket.class, AvailableCommandsSerializer_v594.INSTANCE, 76)
            .registerPacket(CommandRequestPacket.class, CommandRequestSerializer_v567.INSTANCE, 77)
            .registerPacket(CommandBlockUpdatePacket.class, CommandBlockUpdateSerializer_v361.INSTANCE, 78)
            .registerPacket(CommandOutputPacket.class, CommandOutputSerializer_v291.INSTANCE, 79)
            .registerPacket(UpdateTradePacket.class, UpdateTradeSerializer_v354.INSTANCE, 80)
            .registerPacket(UpdateEquipPacket.class, UpdateEquipSerializer_v291.INSTANCE, 81)
            .registerPacket(ResourcePackDataInfoPacket.class, ResourcePackDataInfoSerializer_v361.INSTANCE, 82)
            .registerPacket(ResourcePackChunkDataPacket.class, ResourcePackChunkDataSerializer_v388.INSTANCE, 83)
            .registerPacket(ResourcePackChunkRequestPacket.class, ResourcePackChunkRequestSerializer_v291.INSTANCE, 84)
            .registerPacket(TransferPacket.class, TransferSerializer_v291.INSTANCE, 85)
            .registerPacket(PlaySoundPacket.class, PlaySoundSerializer_v291.INSTANCE, 86)
            .registerPacket(StopSoundPacket.class, StopSoundSerializer_v291.INSTANCE, 87)
            .registerPacket(SetTitlePacket.class, SetTitleSerializer_v448.INSTANCE, 88)
            .registerPacket(AddBehaviorTreePacket.class, AddBehaviorTreeSerializer_v291.INSTANCE, 89)
            .registerPacket(StructureBlockUpdatePacket.class, StructureBlockUpdateSerializer_v554.INSTANCE, 90)
            .registerPacket(ShowStoreOfferPacket.class, ShowStoreOfferSerializer_v630.INSTANCE, 91)
            .registerPacket(PurchaseReceiptPacket.class, PurchaseReceiptSerializer_v291.INSTANCE, 92)
            .registerPacket(PlayerSkinPacket.class, PlayerSkinSerializer_v390.INSTANCE, 93)
            .registerPacket(SubClientLoginPacket.class, SubClientLoginSerializer_v291.INSTANCE, 94)
            .registerPacket(AutomationClientConnectPacket.class, AutomationClientConnectSerializer_v291.INSTANCE, 95)
            .registerPacket(SetLastHurtByPacket.class, SetLastHurtBySerializer_v291.INSTANCE, 96)
            .registerPacket(BookEditPacket.class, BookEditSerializer_v291.INSTANCE, 97)
            .registerPacket(NpcRequestPacket.class, NpcRequestSerializer_v448.INSTANCE, 98)
            .registerPacket(PhotoTransferPacket.class, PhotoTransferSerializer_v465.INSTANCE, 99)
            .registerPacket(ModalFormRequestPacket.class, ModalFormRequestSerializer_v291.INSTANCE, 100)
            .registerPacket(ModalFormResponsePacket.class, ModalFormResponseSerializer_v544.INSTANCE, 101)
            .registerPacket(ServerSettingsRequestPacket.class, ServerSettingsRequestSerializer_v291.INSTANCE, 102)
            .registerPacket(ServerSettingsResponsePacket.class, ServerSettingsResponseSerializer_v291.INSTANCE, 103)
            .registerPacket(ShowProfilePacket.class, ShowProfileSerializer_v291.INSTANCE, 104)
            .registerPacket(SetDefaultGameTypePacket.class, SetDefaultGameTypeSerializer_v291.INSTANCE, 105)
            .registerPacket(RemoveObjectivePacket.class, RemoveObjectiveSerializer_v291.INSTANCE, 106)
            .registerPacket(SetDisplayObjectivePacket.class, SetDisplayObjectiveSerializer_v291.INSTANCE, 107)
            .registerPacket(SetScorePacket.class, SetScoreSerializer_v291.INSTANCE, 108)
            .registerPacket(LabTablePacket.class, LabTableSerializer_v291.INSTANCE, 109)
            .registerPacket(UpdateBlockSyncedPacket.class, UpdateBlockSyncedSerializer_v291.INSTANCE, 110)
            .registerPacket(MoveEntityDeltaPacket.class, MoveEntityDeltaSerializer_v419.INSTANCE, 111)
            .registerPacket(SetScoreboardIdentityPacket.class, SetScoreboardIdentitySerializer_v291.INSTANCE, 112)
            .registerPacket(SetLocalPlayerAsInitializedPacket.class, SetLocalPlayerAsInitializedSerializer_v291.INSTANCE, 113)
            .registerPacket(UpdateSoftEnumPacket.class, UpdateSoftEnumSerializer_v291.INSTANCE, 114)
            .registerPacket(NetworkStackLatencyPacket.class, NetworkStackLatencySerializer_v332.INSTANCE, 115)
            .registerPacket(ScriptCustomEventPacket.class, ScriptCustomEventSerializer_v291.INSTANCE, 117)
            .registerPacket(SpawnParticleEffectPacket.class, SpawnParticleEffectSerializer_v503.INSTANCE, 118)
            .registerPacket(AvailableEntityIdentifiersPacket.class, AvailableEntityIdentifiersSerializer_v313.INSTANCE, 119)
            .registerPacket(LevelSoundEvent2Packet.class, LevelSoundEvent2Serializer_v407.INSTANCE, 120)
            .registerPacket(NetworkChunkPublisherUpdatePacket.class, NetworkChunkPublisherUpdateSerializer_v544.INSTANCE, 121)
            .registerPacket(BiomeDefinitionListPacket.class, BiomeDefinitionListSerializer_v313.INSTANCE, 122)
            .registerPacket(LevelSoundEventPacket.class, LevelSoundEventSerializer_v407.INSTANCE, 123)
            .registerPacket(LevelEventGenericPacket.class, LevelEventGenericSerializer_v361.INSTANCE, 124)
            .registerPacket(LecternUpdatePacket.class, LecternUpdateSerializer_v354.INSTANCE, 125)
            .registerPacket(VideoStreamConnectPacket.class, VideoStreamConnectSerializer_v361.INSTANCE, 126)
            // AddEntityPacket 127
            // RemoveEntityPacket 128
            .registerPacket(ClientCacheStatusPacket.class, ClientCacheStatusSerializer_v361.INSTANCE, 129)
            .registerPacket(OnScreenTextureAnimationPacket.class, OnScreenTextureAnimationSerializer_v354.INSTANCE, 130)
            .registerPacket(MapCreateLockedCopyPacket.class, MapCreateLockedCopySerializer_v354.INSTANCE, 131)
            .registerPacket(StructureTemplateDataRequestPacket.class, StructureTemplateDataRequestSerializer_v361.INSTANCE, 132)
            .registerPacket(StructureTemplateDataResponsePacket.class, StructureTemplateDataResponseSerializer_v388.INSTANCE, 133)
            .registerPacket(ClientCacheBlobStatusPacket.class, ClientCacheBlobStatusSerializer_v361.INSTANCE, 135)
            .registerPacket(ClientCacheMissResponsePacket.class, ClientCacheMissResponseSerializer_v361.INSTANCE, 136)
            .registerPacket(EducationSettingsPacket.class, EducationSettingsSerializer_v465.INSTANCE, 137)
            .registerPacket(EmotePacket.class, EmoteSerializer_v589.INSTANCE, 138)
            .registerPacket(MultiplayerSettingsPacket.class, MultiplayerSettingsSerializer_v388.INSTANCE, 139)
            .registerPacket(SettingsCommandPacket.class, SettingsCommandSerializer_v388.INSTANCE, 140)
            .registerPacket(AnvilDamagePacket.class, AnvilDamageSerializer_v388.INSTANCE, 141)
            .registerPacket(CompletedUsingItemPacket.class, CompletedUsingItemSerializer_v388.INSTANCE, 142)
            .registerPacket(NetworkSettingsPacket.class, NetworkSettingsSerializer_v554.INSTANCE, 143)
            .registerPacket(PlayerAuthInputPacket.class, PlayerAuthInputSerializer_v575.INSTANCE, 144)
            .registerPacket(CreativeContentPacket.class, CreativeContentSerializer_v407.INSTANCE, 145)
            .registerPacket(PlayerEnchantOptionsPacket.class, PlayerEnchantOptionsSerializer_v407.INSTANCE, 146)
            .registerPacket(ItemStackRequestPacket.class, ItemStackRequestSerializer_v407.INSTANCE, 147)
            .registerPacket(ItemStackResponsePacket.class, ItemStackResponseSerializer_v428.INSTANCE, 148)
            .registerPacket(PlayerArmorDamagePacket.class, PlayerArmorDamageSerializer_v407.INSTANCE, 149)
            .registerPacket(CodeBuilderPacket.class, CodeBuilderSerializer_v407.INSTANCE, 150)
            .registerPacket(UpdatePlayerGameTypePacket.class, UpdatePlayerGameTypeSerializer_v407.INSTANCE, 151)
            .registerPacket(EmoteListPacket.class, EmoteListSerializer_v407.INSTANCE, 152)
            .registerPacket(PositionTrackingDBServerBroadcastPacket.class, PositionTrackingDBServerBroadcastSerializer_v407.INSTANCE, 153)
            .registerPacket(PositionTrackingDBClientRequestPacket.class, PositionTrackingDBClientRequestSerializer_v407.INSTANCE, 154)
            .registerPacket(DebugInfoPacket.class, DebugInfoSerializer_v407.INSTANCE, 155)
            .registerPacket(PacketViolationWarningPacket.class, PacketViolationWarningSerializer_v407.INSTANCE, 156)
            .registerPacket(MotionPredictionHintsPacket.class, MotionPredictionHintsSerializer_v419.INSTANCE, 157)
            .registerPacket(AnimateEntityPacket.class, AnimateEntitySerializer_v465.INSTANCE, 158)
            .registerPacket(CameraShakePacket.class, CameraShakeSerializer_v428.INSTANCE, 159)
            .registerPacket(PlayerFogPacket.class, PlayerFogSerializer_v419.INSTANCE, 160)
            .registerPacket(CorrectPlayerMovePredictionPacket.class, CorrectPlayerMovePredictionSerializer_v419.INSTANCE, 161)
            .registerPacket(ItemComponentPacket.class, ItemComponentSerializer_v419.INSTANCE, 162)
            .registerPacket(FilterTextPacket.class, FilterTextSerializer_v422.INSTANCE, 163)
            .registerPacket(ClientboundDebugRendererPacket.class, ClientboundDebugRendererSerializer_v428.INSTANCE, 164)
            .registerPacket(SyncEntityPropertyPacket.class, SyncEntityPropertySerializer_v440.INSTANCE, 165)
            .registerPacket(AddVolumeEntityPacket.class, AddVolumeEntitySerializer_v503.INSTANCE, 166)
            .registerPacket(RemoveVolumeEntityPacket.class, RemoveVolumeEntitySerializer_v503.INSTANCE, 167)
            .registerPacket(SimulationTypePacket.class, SimulationTypeSerializer_v448.INSTANCE, 168)
            .registerPacket(NpcDialoguePacket.class, NpcDialogueSerializer_v448.INSTANCE, 169)
            .registerPacket(EduUriResourcePacket.class, EduUriResourceSerializer_v465.INSTANCE, 170)
            .registerPacket(CreatePhotoPacket.class, CreatePhotoSerializer_v465.INSTANCE, 171)
            .registerPacket(UpdateSubChunkBlocksPacket.class, UpdateSubChunkBlocksSerializer_v465.INSTANCE, 172)
            .registerPacket(PhotoInfoRequestPacket.class, PhotoInfoRequestSerializer_v471.INSTANCE, 173)
            .registerPacket(SubChunkPacket.class, SubChunkSerializer_v486.INSTANCE, 174)
            .registerPacket(SubChunkRequestPacket.class, SubChunkRequestSerializer_v486.INSTANCE, 175)
            .registerPacket(PlayerStartItemCooldownPacket.class, PlayerStartItemCooldownSerializer_v486.INSTANCE, 176)
            .registerPacket(ScriptMessagePacket.class, ScriptMessageSerializer_v486.INSTANCE, 177)
            .registerPacket(CodeBuilderSourcePacket.class, CodeBuilderSourceSerializer_v486.INSTANCE, 178)
            .registerPacket(TickingAreasLoadStatusPacket.class, TickingAreasLoadStatusSerializer_v503.INSTANCE, 179)
            .registerPacket(DimensionDataPacket.class, DimensionDataSerializer_v503.INSTANCE, 180)
            .registerPacket(AgentActionEventPacket.class, AgentActionEventSerializer_v503.INSTANCE, 181)
            .registerPacket(ChangeMobPropertyPacket.class, ChangeMobPropertySerializer_v503.INSTANCE, 182)
            .registerPacket(LessonProgressPacket.class, LessonProgressSerializer_v527.INSTANCE, 183)
            .registerPacket(RequestAbilityPacket.class, RequestAbilitySerializer_v594.INSTANCE, 184)
            .registerPacket(RequestPermissionsPacket.class, RequestPermissionsSerializer_v527.INSTANCE, 185)
            .registerPacket(ToastRequestPacket.class, ToastRequestSerializer_v527.INSTANCE, 186)
            .registerPacket(UpdateAbilitiesPacket.class, UpdateAbilitiesSerializer_v534.INSTANCE, 187)
            .registerPacket(UpdateAdventureSettingsPacket.class, UpdateAdventureSettingsSerializer_v534.INSTANCE, 188)
            .registerPacket(DeathInfoPacket.class, DeathInfoSerializer_v534.INSTANCE, 189)
            .registerPacket(EditorNetworkPacket.class, EditorNetworkSerializer_v534.INSTANCE, 190)
            .registerPacket(FeatureRegistryPacket.class, FeatureRegistrySerializer_v544.INSTANCE, 191)
            .registerPacket(ServerStatsPacket.class, ServerStatsSerializer_v554.INSTANCE, 192)
            .registerPacket(RequestNetworkSettingsPacket.class, RequestNetworkSettingsSerializer_v554.INSTANCE, 193)
            .registerPacket(GameTestRequestPacket.class, GameTestRequestSerializer_v554.INSTANCE, 194)
            .registerPacket(GameTestResultsPacket.class, GameTestResultsSerializer_v554.INSTANCE, 195)
            .registerPacket(UpdateClientInputLocksPacket.class, UpdateClientInputLocksSerializer_v560.INSTANCE, 196)
            .registerPacket(ClientCheatAbilityPacket.class, ClientCheatAbilitySerializer_v567.INSTANCE, 197)
            .registerPacket(CameraPresetsPacket.class, CameraPresetsSerializer_v618.INSTANCE, 198)
            .registerPacket(CameraInstructionPacket.class, CameraInstructionSerializer_v618.INSTANCE, 199)
            .registerPacket(UnlockedRecipesPacket.class, UnlockedRecipesSerializer_v575.INSTANCE, 300)
            .registerPacket(CompressedBiomeDefinitionListPacket.class, CompressedBiomeDefinitionListSerializer_v582.INSTANCE, 301)
            .registerPacket(TrimDataPacket.class, TrimDataSerializer_v582.INSTANCE, 302)
            .registerPacket(OpenSignPacket.class, OpenSignSerializer_v582.INSTANCE, 303)
            .registerPacket(AgentAnimationPacket.class, AgentAnimationSerializer_v594.INSTANCE, 304)
            .registerPacket(ServerPostMovePositionPacket.class, ServerPostMovePositionSerializer_v630.INSTANCE, 16)
            .registerPacket(ToggleCrafterSlotRequestPacket.class, ToggleCrafterSlotRequestSerializer_v630.INSTANCE, 306)
            .registerPacket(SetPlayerInventoryOptionsPacket.class, SetPlayerInventoryOptionsSerializer_v630.INSTANCE, 307)
            .build();
}