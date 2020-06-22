package io.mosidian.modules.logistics.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-06-04 15:36:46
 */
@Data
@TableName("tb_logistics")
public class LogisticsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 会员卡ID
	 */
	@TableId(type = IdType.INPUT)
	private String enId;
	/**
	 * 登录ID
	 */
	private Long userId;
	/**
	 * 企业全称
	 */
	private String name;
	/**
	 * 企业官网
	 */
	private String website;
	/**
	 * 企业规模
	 */
	private String scale;
	/**
	 * 企业简介
	 */
	private String synopsis;
	/**
	 * 法人
	 */
	private String corporation;
	/**
	 * 认证理由
	 */
	private String reason;
	/**
	 * 提供的服务
	 */
	private String eserver;
	/**
	 * 企业类型
	 */
	private String companies;
	/**
	 * 负责人
	 */
	private String headName;
	/**
	 * 部门
	 */
	private String sector;
	/**
	 * 职位
	 */
	private String eposition;
	/**
	 * 负责人身份证号
	 */
	private String headCard;
	/**
	 * 负责人电话
	 */
	private String emobile;
	/**
	 * 负责人邮箱
	 */
	private String eemail;
	/**
	 * 审核状态
	 */
	private Integer audit;
	/**
	 *   审核人
	 */
	private String modifier;
	/**
	 * 信誉分
	 */
	private Integer credits;
	/**
	 * 统一社会信用代码
	 */
	private String enlicenseId;
	/**
	 * 企业LOGO
	 */
	private String avatar;
	/**
	 * 注册地址
	 */
	private String domicile;
	/**
	 * 余额
	 */
	private BigDecimal balance;
	/**
	 * 等级
	 */
	private Integer level;
	/**
	 * 消费金额
	 */
	private BigDecimal monetary;
	/**
	 * 营业执照
	 */
	private String enlicense;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
