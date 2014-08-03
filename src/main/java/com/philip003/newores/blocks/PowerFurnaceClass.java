/*
 * package com.philip003.newores.blocks;
 * 
 * import java.util.Random;
 * 
 * import net.minecraft.block.Block; import net.minecraft.block.BlockContainer;
 * import net.minecraft.block.material.Material; import
 * net.minecraft.client.renderer.texture.IIconRegister; import
 * net.minecraft.entity.EntityLivingBase; import
 * net.minecraft.entity.item.EntityItem; import
 * net.minecraft.entity.player.EntityPlayer; import net.minecraft.item.Item;
 * import net.minecraft.item.ItemStack; import net.minecraft.nbt.NBTTagCompound;
 * import net.minecraft.tileentity.TileEntity; import net.minecraft.util.IIcon;
 * import net.minecraft.util.MathHelper; import net.minecraft.world.World;
 * 
 * import com.philip003.newores.NewOres; import
 * com.philip003.newores.blocks.tileentities.PowerFurnaceTileEntity;
 * 
 * import cpw.mods.fml.relauncher.Side; import cpw.mods.fml.relauncher.SideOnly;
 * 
 * public class PowerFurnaceClass extends BlockContainer {
 * 
 * @SideOnly(Side.CLIENT) private IIcon top;
 * 
 * @SideOnly(Side.CLIENT) private IIcon front;
 * 
 * private static boolean isBurning; private final boolean isBurning2; private
 * final Random random = new Random();
 * 
 * public PowerFurnaceClass(boolean isActive) { super(Material.rock); isBurning2
 * = isActive; }
 * 
 * @SideOnly(Side.CLIENT) public void registerIcons(IIconRegister IconRegistry)
 * { this.blockIcon = IconRegistry.registerIcon(NewOres.MODID +
 * ":powerfurnace_side"); this.front = IconRegistry.registerIcon(this.isBurning2
 * ? NewOres.MODID + ":powerfurnace_front_on" : NewOres.MODID +
 * ":powerfurnace_front_off"); this.top =
 * IconRegistry.registerIcon(NewOres.MODID + ":powerfurnace_top"); }
 * 
 * public IIcon getIcon(int side, int meta) { if (side == 1) { return top; }
 * else if (side == 3) { return front; } else { return this.blockIcon; }
 * 
 * }
 * 
 * public boolean onBlockActivated(World world, int x, int y, int z,
 * EntityPlayer player, int par6, float par7, float par8, float par9) {
 * player.openGui(NewOres.instance, 0, world, x, y, z); return true; }
 * 
 * public Item getItemDropped(int par1, Random random, int par3) { return
 * Item.getItemFromBlock(NewOres.powerFurnaceIdle); }
 * 
 * public Item getItem(World world, int par2, int par3, int par4) { return
 * Item.getItemFromBlock(NewOres.powerFurnaceIdle); }
 * 
 * @SideOnly(Side.CLIENT) public void onBlockAdded(World world, int x, int y,
 * int z) { super.onBlockAdded(world, x, y, z); this.direction(world, x, y, z);
 * }
 * 
 * private void direction(World world, int x, int y, int z) { if
 * (!world.isRemote) { Block direction = world.getBlock(x, y, z - 1); Block
 * direction1 = world.getBlock(x, y, z + 1); Block direction2 = world.getBlock(x
 * - 1, y, z); Block direction3 = world.getBlock(x + 1, y, z); byte byte0 = 3;
 * 
 * if (direction.func_149730_j() && direction.func_149730_j()) { byte0 = 3; } if
 * (direction1.func_149730_j() && direction1.func_149730_j()) { byte0 = 2; } if
 * (direction2.func_149730_j() && direction2.func_149730_j()) { byte0 = 5; } if
 * (direction3.func_149730_j() && direction3.func_149730_j()) { byte0 = 4; }
 * world.setBlockMetadataWithNotify(x, y, z, byte0, 2); } }
 * 
 * public void onBlockPlacedBy(World world, int x, int y, int z,
 * EntityLivingBase entity, ItemStack stack) { int direction = MathHelper
 * .floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
 * 
 * if (direction == 0) { world.setBlockMetadataWithNotify(x, y, z, 2, 2); } if
 * (direction == 1) { world.setBlockMetadataWithNotify(x, y, z, 5, 2); } if
 * (direction == 2) { world.setBlockMetadataWithNotify(x, y, z, 3, 2); } if
 * (direction == 3) { world.setBlockMetadataWithNotify(x, y, z, 4, 2); } if
 * (stack.hasDisplayName()) { ((TileEntityPowerFurnace) world.getTileEntity(x,
 * y, z)) .furnaceName(stack.getDisplayName()); } }
 * 
 * public static void updateBlockState(boolean burning, World world, int x, int
 * y, int z) { int direction = world.getBlockMetadata(x, y, z); TileEntity
 * tileEntity = world.getTileEntity(x, y, z); isBurning = true;
 * 
 * if (burning) { world.setBlock(x, y, z, NewOres.powerFurnaceActive); } else {
 * world.setBlock(x, y, z, NewOres.powerFurnaceIdle); }
 * 
 * isBurning = false;
 * 
 * world.setBlockMetadataWithNotify(x, y, z, direction, 2);
 * 
 * if (tileEntity != null) { tileEntity.validate(); world.setTileEntity(x, y, z,
 * tileEntity); } }
 * 
 * public void breakBlock(World world, int x, int y, int z, Block block, int
 * meta) { if (!isBurning) { PowerFurnaceTileEntity tileEntityFurnace =
 * (PowerFurnaceTileEntity) world .getTileEntity(x, y, z); if (tileEntityFurnace
 * != null) { for (int i = 0; i < tileEntityFurnace.getInventorySize; i++) {
 * ItemStack stack = tileEntityFurnace.getStackInSlot(i);
 * 
 * if (stack != null) { float f1 = this.random.nextFloat() * 0.6F + 0.1F; // x
 * float f2 = this.random.nextFloat() * 0.6F + 0.1F; // y float f3 =
 * this.random.nextFloat() * 0.6F + 0.1F; // z
 * 
 * while (stack.stackSize > 0) { int j = this.random.nextInt(21) + 10;
 * 
 * if (j > stack.stackSize) { j = stack.stackSize; } stack.stackSize -= j;
 * EntityItem entityItem = new EntityItem(world, (double) ((float) x + f1),
 * (double) ((float) y + f2), (double) ((float) z + f3), new ItemStack(
 * stack.getItem(), j, stack.getItemDamage()));
 * 
 * if (stack.hasTagCompound()) { entityItem.getEntityItem().setTagCompound(
 * (NBTTagCompound) stack.getTagCompound() .copy()); }
 * 
 * float f4 = 0.025F; entityItem.motionX = (double) ((float) this.random
 * .nextGaussian() * f4); entityItem.motionY = (double) ((float) this.random
 * .nextGaussian() * f4 + 0.1F); entityItem.motionZ = (double) ((float)
 * this.random .nextGaussian() * f4);
 * 
 * world.spawnEntityInWorld(entityItem); } } } world.func_147453_f(x, y, z,
 * block); } }
 * 
 * super.breakBlock(world, x, y, z, block, meta); }
 * 
 * @SideOnly(Side.CLIENT) public void randomDisplayTick(World world, int x, int
 * y, int z, Random random) { if (isBurning2) { int direction =
 * world.getBlockMetadata(x, y, z);
 * 
 * float xx = (float) x + 0.5F, yy = (float) random.nextFloat() * 6.0F / 16.0F,
 * zz = (float) z + 0.5F, xx2 = random .nextFloat() * 0.3F - 0.2F, zz2 = 0.5F;
 * 
 * if (direction == 4) { world.spawnParticle("smoke", (double) (xx - zz2),
 * (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F);
 * world.spawnParticle("flame", (double) (xx - zz2), (double) yy, (double) (zz +
 * xx2), 0.0F, 0.0F, 0.0F); } else if (direction == 5) {
 * world.spawnParticle("smoke", (double) (xx - zz2), (double) yy, (double) (zz +
 * xx2), 0.0F, 0.0F, 0.0F); world.spawnParticle("flame", (double) (xx - zz2),
 * (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F); } else if (direction ==
 * 3) { world.spawnParticle("smoke", (double) (xx - zz2), (double) yy, (double)
 * (zz + xx2), 0.0F, 0.0F, 0.0F); world.spawnParticle("flame", (double) (xx -
 * zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F); } else if
 * (direction == 2) { world.spawnParticle("smoke", (double) (xx - zz2), (double)
 * yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F); world.spawnParticle("flame",
 * (double) (xx - zz2), (double) yy, (double) (zz + xx2), 0.0F, 0.0F, 0.0F); } }
 * }
 * 
 * @Override public TileEntity createNewTileEntity(World var1, int var2) {
 * return null; } }
 */