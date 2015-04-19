package com.patricklang.neimod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.patricklang.neimod.init.NEIItems;
import com.patricklang.neimod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class NEIMod {
	public static ItemStack stickStack;
	public static ItemStack eyeOfEnderStack;
	public static ItemStack emeraldStack;
	public static ItemStack emeraldShardStack;
	public static ItemStack cobblestoneStack;
	public static ItemStack cobblestoneShardStack;
	public static ItemStack coalStack;
	public static ItemStack coalShardStack;
	public static ItemStack featherStack;
	public static ItemStack stringStack;
	public static ItemStack stoneStack;
	public static ItemStack flintStack;
	public static ItemStack tntStack;
	public static ItemStack flintAndSteelStack;
	public static ItemStack diamondStack;
	public static ItemStack diamondShardStack;
	public static ItemStack diamondBlockStack;
	public static ItemStack ironIngotStack;
	public static ItemStack ironShardStack;
	public static ItemStack ironBlockStack;
	public static ItemStack plankStack;
	public static ItemStack goldIngotStack;
	public static ItemStack goldShardStack;
	public static ItemStack inksackStack;
	public static ItemStack rottonFleshStack;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		NEIItems.init();
		NEIItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
		stickStack = new ItemStack(Items.stick);
		eyeOfEnderStack = new ItemStack(Items.ender_eye);
		emeraldStack = new ItemStack(Items.emerald);
		emeraldShardStack = new ItemStack(NEIItems.EmeraldShard);
		cobblestoneStack = new ItemStack(Blocks.cobblestone);
		cobblestoneShardStack = new ItemStack(NEIItems.CobblestoneShard);
		coalStack = new ItemStack(Items.coal);
		coalShardStack = new ItemStack(NEIItems.CoalShard);
		featherStack = new ItemStack(Items.feather);
		stringStack = new ItemStack(Items.string);
		stoneStack = new ItemStack(Blocks.stone);
		flintStack = new ItemStack(Items.flint);
		tntStack = new ItemStack(Blocks.tnt);
		flintAndSteelStack = new ItemStack(Items.flint_and_steel);
		diamondStack = new ItemStack(Items.diamond);
		diamondBlockStack = new ItemStack(Blocks.diamond_block);
		diamondShardStack = new ItemStack(NEIItems.DiamondShard);
		ironIngotStack = new ItemStack(Items.iron_ingot);
		ironBlockStack = new ItemStack(Blocks.iron_block);
		ironShardStack = new ItemStack(NEIItems.IronShard);
		plankStack = new ItemStack(Blocks.planks);
		goldIngotStack = new ItemStack(Items.gold_ingot);
		goldShardStack = new ItemStack(NEIItems.GoldShard);
		inksackStack = new ItemStack(Items.dye);
		rottonFleshStack = new ItemStack(Items.rotten_flesh);
		
		GameRegistry.addRecipe(new ItemStack(NEIItems.StoneSword),"S","s","s",'S',stoneStack,'s',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.HotSword),"F","C","S",'F',flintStack,'C',coalStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.TPHitStick),"EEE","ESE","EEE",'E',eyeOfEnderStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.TPStick),"  E"," S ","S  ",'E',Items.ender_pearl,'S',stickStack);
		//GameRegistry.addRecipe(new ItemStack(NEIItems.MountainBlaster),"T  "," F ","  S",'T',tntStack,'F',flintAndSteelStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.BossDiamondSword),"D","D","P",'D',diamondBlockStack,'P',plankStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.CoalDagger),"   ","C  "," S ",'C',coalShardStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.CoalShard, 9),"   "," C ","   ",'C',coalStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.CobblestoneDagger),"   ","C  "," S ",'C',cobblestoneShardStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.CobblestoneShard, 9),"   "," C ","   ",'C',cobblestoneStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.DiamondDagger),"   ","D  "," S ",'D',diamondShardStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.DiamondShard, 9),"   "," D ","   ",'D',diamondStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.DogFood),"RRR","RRR","RRR",'R',rottonFleshStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldArrow),"E","S","F",'E',emeraldStack,'S',stickStack, 'F', featherStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldAxe),"EE","ES"," S",'E',emeraldStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldBow)," Es","S s"," Es",'E',emeraldStack,'S',stickStack,'s',stringStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldDagger),"  ","E "," S",'E',emeraldShardStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldHoe),"EE"," S"," S",'E',emeraldStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldPickaxe),"EEE"," S "," S ",'E',emeraldStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldShard, 9),"   "," E ","   ",'E',emeraldStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldShovel),"E","S","S",'E',emeraldStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.EmeraldSword),"E","E","S",'E',emeraldStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.GoldDagger),"   ","G  "," S ",'G',goldShardStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.GoldShard, 9),"   "," G ","   ",'G',goldIngotStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.Gun),"T  "," F ","  S",'T',tntStack,'F',flintAndSteelStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.IronDagger),"   ","I  "," S ",'I',ironShardStack,'S',stickStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.IronShard, 9),"   "," I ","   ",'I',ironIngotStack);
		GameRegistry.addRecipe(new ItemStack(NEIItems.NinjaStar),"III","IiI","III",'I',ironIngotStack,'i',inksackStack);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public static final CreativeTabs notEnoughItemsTab = new CreativeTabs("notEnoughItemsTab"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(NEIItems.HotSword).getItem();
		}
	};
}
