package com.patricklang.neimod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.patricklang.neimod.NEIMod;
import com.patricklang.neimod.Reference;
import com.patricklang.neimod.item.ItemEmeraldArrow;
import com.patricklang.neimod.item.ItemEmeraldAxe;
import com.patricklang.neimod.item.ItemEmeraldBow;
import com.patricklang.neimod.item.ItemEmeraldHoe;
import com.patricklang.neimod.item.ItemEmeraldPickaxe;
import com.patricklang.neimod.item.ItemEmeraldShovel;
import com.patricklang.neimod.item.ItemEmeraldSword;
import com.patricklang.neimod.item.ItemTPStick;
import com.patricklang.neimod.items.ItemMtnBlaster;

public class NEIItems {

	public static Item StoneSword;
	public static Item HotSword;
	public static Item TPHitStick;
	public static Item TPStick;
	public static Item MountainBlaster;
	public static Item BossDiamondSword;
	public static Item CoalDagger;
	public static Item CoalShard;
	public static Item CobblestoneDagger;
	public static Item CobblestoneShard;
	public static Item DiamondDagger;
	public static Item DiamondShard;
	public static Item DogFood;
	
	public static Item EmeraldArrow;
	public static Item EmeraldAxe;
	public static Item EmeraldBow;
	public static Item EmeraldDagger;
	public static Item EmeraldHoe;
	public static Item EmeraldPickaxe;
	public static Item EmeraldShard;
	public static Item EmeraldShovel;
	public static Item EmeraldSword;
	
	public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emearldToolMaterial", 4, 2000, 12.0F, 4.0F, 10);
	
	public static Item GoldDagger;
	public static Item GoldShard;
	public static Item Gun;
	public static Item IronDagger;	
	public static Item IronShard;
	public static Item NinjaStar;
	
	public static void init(){
		StoneSword = new ItemSword(ToolMaterial.STONE).setUnlocalizedName("StoneSword").setCreativeTab(NEIMod.notEnoughItemsTab);
		HotSword = new ItemSword(ToolMaterial.IRON).setUnlocalizedName("HotSword").setCreativeTab(NEIMod.notEnoughItemsTab);

		TPHitStick = new Item().setUnlocalizedName("TPHitStick").setCreativeTab(NEIMod.notEnoughItemsTab);
		TPStick = new ItemTPStick().setUnlocalizedName("TPStick").setCreativeTab(NEIMod.notEnoughItemsTab);

		MountainBlaster = new ItemMtnBlaster().setUnlocalizedName("MountainBlaster").setCreativeTab(NEIMod.notEnoughItemsTab);

		BossDiamondSword = new ItemSword(ToolMaterial.EMERALD).setUnlocalizedName("BossDiamondSword").setCreativeTab(NEIMod.notEnoughItemsTab);

		CoalDagger = new Item().setUnlocalizedName("CoalDagger").setCreativeTab(NEIMod.notEnoughItemsTab);
		CoalShard = new Item().setUnlocalizedName("CoalShard").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);

		CobblestoneDagger = new Item().setUnlocalizedName("CobblestoneDagger").setCreativeTab(NEIMod.notEnoughItemsTab);
		CobblestoneShard = new Item().setUnlocalizedName("CobblestoneShard").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);;

		DiamondDagger = new Item().setUnlocalizedName("DiamondDagger").setCreativeTab(NEIMod.notEnoughItemsTab);
		DiamondShard = new Item().setUnlocalizedName("DiamondShard").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);

		DogFood = new ItemFood(2, 0.5F, true ).setUnlocalizedName("DogFood").setPotionEffect("poison").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);

		EmeraldSword = new ItemEmeraldSword(emeraldToolMaterial).setUnlocalizedName("EmeraldSword").setCreativeTab(NEIMod.notEnoughItemsTab);
		EmeraldBow = new ItemEmeraldBow().setUnlocalizedName("EmeraldBow").setCreativeTab(NEIMod.notEnoughItemsTab);
		EmeraldArrow = new ItemEmeraldArrow().setUnlocalizedName("EmeraldArrow").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);
		EmeraldAxe = new ItemEmeraldAxe(emeraldToolMaterial).setUnlocalizedName("EmeraldAxe").setCreativeTab(NEIMod.notEnoughItemsTab);
		EmeraldHoe = new ItemEmeraldHoe(emeraldToolMaterial).setUnlocalizedName("EmeraldHoe").setCreativeTab(NEIMod.notEnoughItemsTab);;
		EmeraldShovel = new ItemEmeraldShovel().setUnlocalizedName("EmeraldShovel").setCreativeTab(NEIMod.notEnoughItemsTab);
		EmeraldPickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial).setUnlocalizedName("EmeraldPickaxe").setCreativeTab(NEIMod.notEnoughItemsTab);
		EmeraldDagger = new Item().setUnlocalizedName("EmeraldDagger").setCreativeTab(NEIMod.notEnoughItemsTab);
		EmeraldShard = new Item().setUnlocalizedName("EmeraldShard").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);

		GoldDagger = new Item().setUnlocalizedName("GoldDagger").setCreativeTab(NEIMod.notEnoughItemsTab);;
		GoldShard = new Item().setUnlocalizedName("GoldShard").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);

		Gun = new Item().setUnlocalizedName("Gun").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);

		IronDagger = new Item().setUnlocalizedName("IronDagger").setCreativeTab(NEIMod.notEnoughItemsTab);
		IronShard = new Item().setUnlocalizedName("IronShard").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);

		NinjaStar = new Item().setUnlocalizedName("NinjaStar").setMaxStackSize(64).setCreativeTab(NEIMod.notEnoughItemsTab);
	}
	
	public static void register(){
		GameRegistry.registerItem(StoneSword, StoneSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(HotSword, HotSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TPHitStick, TPHitStick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TPStick, TPStick.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(MountainBlaster, MountainBlaster.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BossDiamondSword, BossDiamondSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CoalDagger, CoalDagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CoalShard, CoalShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CobblestoneDagger, CobblestoneDagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CobblestoneShard, CobblestoneShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DiamondDagger, DiamondDagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DiamondShard, DiamondShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DogFood, DogFood.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldArrow, EmeraldArrow.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldAxe, EmeraldAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldBow, EmeraldBow.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldDagger, EmeraldDagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldHoe, EmeraldHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldPickaxe, EmeraldPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldShard, EmeraldShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldShovel, EmeraldShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(EmeraldSword, EmeraldSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(GoldDagger, GoldDagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(GoldShard, GoldShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Gun, Gun.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IronDagger, IronDagger.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(IronShard, IronShard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(NinjaStar, NinjaStar.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(StoneSword);
		registerRender(HotSword);
		registerRender(TPHitStick);
		registerRender(TPStick);
		registerRender(MountainBlaster);
		registerRender(BossDiamondSword);
		registerRender(CoalDagger);
		registerRender(CoalShard);
		registerRender(CobblestoneDagger);
		registerRender(CobblestoneShard);
		registerRender(DiamondDagger);
		registerRender(DiamondShard);
		registerRender(DogFood);
		registerRender(EmeraldArrow);
		registerRender(EmeraldAxe);
		registerRender(EmeraldBow);
		registerRender(EmeraldDagger);
		registerRender(EmeraldHoe);
		registerRender(EmeraldPickaxe);
		registerRender(EmeraldShard);
		registerRender(EmeraldShovel);
		registerRender(EmeraldSword);
		registerRender(GoldDagger);
		registerRender(GoldShard);
		registerRender(Gun);
		registerRender(IronDagger);
		registerRender(IronShard);
		registerRender(NinjaStar);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	
}
