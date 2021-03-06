package de.johni0702.minecraft.betterportals.common.entity

import net.minecraft.util.EnumFacing
import net.minecraft.util.Rotation
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class NetherPortalEntity(
        world: World,
        plane: EnumFacing.Plane,
        portalBlocks: Set<BlockPos>,
        localDimension: Int, localPosition: BlockPos, localRotation: Rotation
) : AbstractPortalEntity(
        world, plane, portalBlocks,
        localDimension, localPosition, localRotation,
        null, BlockPos.ORIGIN, Rotation.NONE
) {
    @Suppress("unused")
    constructor(world: World) : this(world, EnumFacing.Plane.VERTICAL, emptySet(), 0, BlockPos.ORIGIN, Rotation.NONE)
}