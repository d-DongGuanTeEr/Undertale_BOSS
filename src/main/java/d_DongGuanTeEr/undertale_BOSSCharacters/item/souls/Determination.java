package d_DongGuanTeEr.undertale_BOSSCharacters.item.souls;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTab_UT_BOSS;

public class Determination extends HumanSoul{

	public static HumanSoul determination=new Determination();
	
	public Determination() {
		//将物品添加至创造模式物品栏中。
		this.setCreativeTab(CreativeTab_UT_BOSS.SOULICON);
	}
}
