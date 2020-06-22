package io.mosidian.modules.logistics.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author ZSY
 * @createTime 2020/5/29 16:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogisticsVo {

    /*** 用户ID*/
    private Long userId;
    /*** 用户名*/
    private String username;
    private String email;
    private String mobile;
    private Integer status;
    /*** 会员卡号（如：BIC2020-0000-0000）*/
    private String enId;
    /*** 注册地址*/
    private String domicile;
    /*** 头像*/
    private String avatar;
    /*** 等级：1- Cu（铜），2-Ag（银），3-Au（金），4-Pt（铂），5-Zu（钻），6-MS（曜【白】），6-MS（曜【黑】），7-Ti（晶）*/
    private Integer level;
    /*** 信誉分（默认：600）*/
    private Integer credits;
    private Date createTime;
    @TableField(update = "now()")
    private Date updateTime;
    /*** 企业全称*/
    private String name;
    /*** 企业官网*/
    private String website;
    /*** 企业规模*/
    private String scale;
    /*** 企业简介*/
    private String synopsis;
    /*** 法人*/
    private String corporation;
    /*** 认证理由*/
    private String reason;
    /*** 提供的服务*/
    private String eserver;
    /*** 企业类型*/
    private String companies;
    /*** 负责人*/
    private String headName;
    /*** 部门*/
    private String sector;
    /*** 职位*/
    private String eposition;
    /*** 负责人身份证号*/
    private String headCard;
    /*** 负责人电话*/
    private String emobile;
    /*** 负责人邮箱*/
    private String eemail;
    /***   审核人*/
    private String modifier;
    /*** 统一社会信用代码*/
    private String enlicenseId;
    /*** 营业执照*/
    private String enlicense;
    /**
     * 状态
     */

    private Integer audit;
    /**
     * 账户余额（默认：288）
     */
    private BigDecimal balance;

    /**
     * 消费总金额（默认：600）
     */
    private BigDecimal monetary;

    public LogisticsVo(String enId, String username, String email, String mobile, String domicile, String name, String website, String scale, String synopsis, String corporation, String reason, String eserver, String companies, String headName, String sector, String eposition, String headCard, String emobile, String eemail, String modifier, String enlicenseId, BigDecimal banlance, BigDecimal monetary, Integer level) {
        this.enId = enId;
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.domicile = domicile;
        this.name = name;
        this.website = website;
        this.scale = scale;
        this.synopsis = synopsis;
        this.corporation = corporation;
        this.reason = reason;
        this.eserver = eserver;
        this.companies = companies;
        this.headName = headName;
        this.sector = sector;
        this.eposition = eposition;
        this.headCard = headCard;
        this.emobile = emobile;
        this.eemail = eemail;
        this.modifier = modifier;
        this.enlicenseId = enlicenseId;
        this.balance = banlance;
        this.monetary = monetary;
        this.level = level;
    }

    public LogisticsVo(String username, String website, String scale, String corporation, String reason, String eserver, String companies, String name, String headName, String sector, String eposition, String headCard, String emobile, String eemail, String enlicenseId,String avatar, String enlicense) {
        this.username = username;
        this.name = name;
        this.website = website;
        this.scale = scale;
        this.corporation = corporation;
        this.reason = reason;
        this.eserver = eserver;
        this.companies = companies;
        this.headName = headName;
        this.sector = sector;
        this.eposition = eposition;
        this.headCard = headCard;
        this.emobile = emobile;
        this.eemail = eemail;
        this.enlicenseId = enlicenseId;
        this.avatar = avatar;
        this.enlicense = enlicense;
    }
}
