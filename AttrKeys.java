package com.uzone.douzhanguo.module.user.constant;


/**
 * 角色属性key定义
 * @author jonsai
 * <pre>
 *	前100给 ResourceType 保留
 *	从101开始为扩展属性key
 */
public interface AttrKeys {

	/** 战斗力 */
	short TEAM_POWER = 101;
	
	/** 阵营 */
	short CAMP = 102;
	
	/** vip */
	short VIP_LEVEL = 103;
	
	/** 主将等级*/
	short PLAYER_LEVEL = 104;
	
	/** 总冲值/vip经验*/
	short TOTAL_RECHARGE = 105;
	
	/** 先手值/团队速度*/
	short TEAM_SPEED = 106;
	
	/** 世界等级  */
	short WORLD_LEVEL = 107;

	/** 肉身等级 */
	short ROU_SHEN_LEVEL = 108;

	/** 修炼时间 */
	short XIU_LIAN_TIME = 109;

	/** 突破等级 */
	short TU_PO = 110;

	/**
	 * 神识入体
	 */
	Short[] SHEN_SHI_RU_TI = {PLAYER_LEVEL, ROU_SHEN_LEVEL, XIU_LIAN_TIME, TU_PO};
}
