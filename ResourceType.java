package com.uzone.douzhanguo.module.common.constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 奖励内容定义
 * 
 * 需要与中心服同步
 * 
 * 除非是通用的资源，例如 元宝，经验，其余的都以 ITEM_数字 的形式编码
 */
public enum ResourceType {

	/** 仙玉/元宝 */
	GOLD(1, "gold", "item_1"),

	/** 仙玉/内币 */
	NEI_BI(2, "gold", "item_2"),

	/** 仙玉/礼券 */
	WELFARE(3, "gold", "item_3"),

	/** 玩家经验 */
	PLAYER_EXP(4, "exp", "item_4"),

	/** 修为/武将经验 */
	HERO_EXP(5, "heroExp", "item_5"),

	/** 战魂 */
	ITEM_6(6, "item_6", "item_6"),

	/** 高阶挑战券 */
	ITEM_7(7, "item_7", "item_7"),

	/** 突破丹 */
	ITEM_8(8, "item_8", "item_8"),

	/** 灵石/银两 */
	SILVER(9, "silver", "item_9"),

	/** 星魂 */
	ITEM_10(10, "item_10", "item_10"),

	/** 声望币，通过高阶竞技场获得 */
	ITEM_11(11, "item_11", "item_11"),

	/** 宗门贡献 */
	ITEM_12(12, "item_12", "item_12"),

	/** 体力 */
	ENERGY(13, "energy", "item_13"),

	/** 招募经验 */
	ITEM_14(14, "item_14", "item_14"),

	/** 挖宝符，用于神秘宝藏活动替代挖宝 1 次，不可替代挖宝 10 次 */
	ITEM_15(15, "item_15", "item_15"),

	/** 幸运签 */
	ITEM_16(16, "item_16", "item_16"),

	/** 锤子，可用于“砸蛋”活动，可以代替仙玉砸蛋 1 次 */
	ITEM_17(17, "item_17", "item_17"),

	/** 幸运罗盘，用于幸运大转盘活动，替代仙玉抽奖 1 次，不可以替代仙玉抽奖 10 次 */
	ITEM_18(18, "item_18", "item_18"),

	/** 威望币，特定时期开启时，天梯竞技场获得 */
	ITEM_19(19, "item_19", "item_19"),

	/** 礼券，指定充值或消费活动开启时获得，可在礼券商店中购买稀有道具 */
	ITEM_20(20, "item_20", "item_20"),

	/** 将魂，用于英雄商店购买英雄魂魄或其他道具，可在冒险和英雄分解获得。 */
	ITEM_21(21, "ITEM_21", "item_21"),

	/** 刷新令，演武堂刷新使用，每次刷新消耗1个 */
	ITEM_22(22, "item_22", "item_22"),

	/** 珍宝符，用于珍宝商店兑换稀有道具 */
	ITEM_23(23, "item_23", "item_23"),

	/** 凤鸣玉，用于凤鸣阁兑换奇珍异宝 */
	ITEM_24(24, "item_24", "item_24"),

	/** 装备符，可用于装备商城购买装备碎片 */
	ITEM_25(25, "item_25", "item_25"),

	/** 宗门秘符，用于宗门科技殿升级科技，提升英雄全体属性！可在宗门秘境BOSS、科技殿建设等活动获得 */
	ITEM_26(26, "item_26", "item_26"),

	/** 秘境神符，用于兑换秘境商城道具 */
	ITEM_27(27, "item_27", "item_27"),

	/** 活跃度，日常任务活跃度，积累可领取活跃度箱 */
	ITEM_28(28, "item_28", "item_28"),

	/** 友情点，好友赠送，每10点可用于招贤馆普通招募1次 */
	ITEM_29(29, "item_29", "item_29"),

	/** 灵酒，用于招贤馆代替仙玉招募英雄一次 */
	ITEM_30(30, "item_30", "item_30"),

	/** 争霸璧，王者争霸中用于兑换特定英雄 */
	ITEM_31(31, "item_31", "item_31"),

	/** 招募积分，累计1000积分，即可用于招募一名传奇英雄 */
	ITEM_32(32, "item_32", "item_32"),

	/** 仙酿，用于招贤馆招募一名指定种族（人族、鬼族、仙族、妖族）的英雄 */
	ITEM_33(33, "item_33", "item_33"),

	/** 转魂玉，用于将一名英雄转化为本种族的其他英雄 */
	ITEM_34(34, "item_34", "item_34"),

	/** 昆仑玉液，用于招贤馆招募一名神魔种族（神族、魔族）的神将 */
	ITEM_35(35, "item_35", "item_35"),

	/** 征战功勋，累计征战功勋达到一定值，即可领取对应功勋奖励 */
	ITEM_36(36, "item_36", "item_36"),

	/** 竞技挑战券，竞技场挑战所需，每次挑战消耗1个 */
	ITEM_37(37, "item_37", "item_37"),

	/** 竞技积分，用于作为进入王者争霸的依据之一 */
	ITEM_38(38, "item_38", "item_38"),

	/** 护送令，参与护送所需，每次护送消耗1个 */
	ITEM_39(39, "item_39", "item_39"),

	/** 顶级镖车符，参与护送时，使用此道具可直接运送顶级镖车 */
	ITEM_40(40, "item_40", "item_40"),

	/** 精英挑战券，挑战精英副本所需，每次挑战消耗1个 */
	ITEM_41(41, "item_41", "item_41"),

	/** 骰子，参与升灵台所需，每次行动消耗1个 */
	ITEM_42(42, "item_42", "item_42"),

	/** 演武符，参与演武堂所需，每次挑战消耗1个 */
	ITEM_43(43, "item_43", "item_43"),

	/** 遗迹符，用于遗迹探宝活动探宝消耗 */
	ITEM_44(44, "item_44", "item_44"),

	/** VIP经验，用于提升VIP等级 */
	VIP_EXP(45, "vipExp", "item_45"),

	/** 竞技声望，用于竞技商城购买道具 */
	ITEM_46(46, "item_46", "item_46"),

	/** 玄冥令，可用于玄冥殿台投资斗魂战队使用 */
	ITEM_47(47, "item_47", "item_47"),

	/** 暂无用处 */
	ITEM_48(48, "item_48", "item_48"),

	/** 游历卷轴，接取游历任务所需，每次接取消耗1个 */
	ITEM_49(49, "item_49", "item_49"),

	/** 占星盘，用于替代仙玉占星一次 */
	ITEM_50(50, "item_50", "item_50"),

	/** 除魔卷轴，挑战魔灵窟所需，每次挑战消耗1个 */
	ITEM_51(51, "item_51", "item_51"),

	/** 灵魂符晶，英雄于飞升塔进阶时获得的灵魂能量结晶，用于升级绝技等级 */
	ITEM_52(52, "item_52", "item_52"),

	/** 秘境战令，累计秘境战令达到一定值，即可领取对应功勋奖励 */
	ITEM_53(53, "item_53", "item_53"),

	/** 新招募积分 */
	ITEM_54(54, "item_54", "item_54"),

	/** 灵气 */
	LING_QI(55,"item_55","item_55"),

	/** 仙玉/玄玉 */
	XIAN_YU(56,"item_56","item_56"),

	/** 灵石 */
	LING_SHI(57,"item_57","item_57"),

	/** 木材 */
	MU_CAI(58,"item_58","item_58"),

	/** 食物 */
	SHI_WU(59,"item_59","item_59"),

	/** 陨铁 */
	YUN_TIE(60,"item_60","item_60"),

	/** 威望 */
	WEI_WANG(61,"item_61","item_61"),

	/** 仙仆 */
	XIAN_PU(62,"item_62","item_62"),

	/** 多少年修为 */
	XIU_WEI_OF_YEAR(63,"item_63","item_63"),

	/** 修为 */
	XIU_WEI(64,"item_64","item_64"),

	/** 正气值 */
	ZHENG_QI(64,"item_64","item_64"),

	/** 邪气值 */
	XIE_QI(65,"item_65","item_65"),

	/** 门派贡献 */
	GONG_XIAN(66,"item_66","item_66"),
	//
	// /** 修炼速度(效率) TODO*/
	// XIU_LIAN_SPEED(213,"item_213","item_213"),
	;


	//------------------------修仙模块------------------------




	private short code;

	/**
	 * 日志名称
	 */
	private String logName;

	/**
	 * 资源名
	 */
	private String resName;

	private ResourceType(int code) {
		this.code = (short) code;
	}

	private ResourceType(int code, String logName, String resName) {
		this.code = (short) code;
		this.logName = logName;
		this.resName = resName;
	}

	public short getCode() {
		return this.code;
	}

	public String getLogName() {
		return logName;
	}

	public String getResName() {
		return resName;
	}

	private static Map<Short, ResourceType> valueMap = new HashMap<>();

	static {
		for (ResourceType rType : ResourceType.values()) {
			valueMap.put(rType.getCode(), rType);
		}
	}

	public static ResourceType valueOf(int type) {
		return valueMap.get((short) type);
	}

	public static Set<Short> keys() {
		return Collections.unmodifiableSet(valueMap.keySet());
	}

	/**
	 * 是否为元宝资源类型
	 * 
	 * @param code
	 * @return
	 */
	public static boolean isGoldResource(int code) {
		return code == GOLD.code || code == WELFARE.code || code == NEI_BI.code;
	}

}
