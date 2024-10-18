package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 面试申请
 *
 * @author 
 * @email
 */
@TableName("zhaopin_yuyue")
public class ZhaopinYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhaopinYuyueEntity() {

	}

	public ZhaopinYuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 招聘
     */
    @ColumnInfo(comment="招聘",type="int(11)")
    @TableField(value = "zhaopin_id")

    private Integer zhaopinId;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "zhaopin_yuyue_time")

    private Date zhaopinYuyueTime;


    /**
     * 申请原因
     */
    @ColumnInfo(comment="申请原因",type="text")
    @TableField(value = "zhaopin_yuyue_text")

    private String zhaopinYuyueText;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "zhaopin_yuyue_yesno_types")

    private Integer zhaopinYuyueYesnoTypes;


    /**
     * 投递回复
     */
    @ColumnInfo(comment="投递回复",type="text")
    @TableField(value = "zhaopin_yuyue_yesno_text")

    private String zhaopinYuyueYesnoText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：招聘
	 */
    public Integer getZhaopinId() {
        return zhaopinId;
    }
    /**
	 * 设置：招聘
	 */

    public void setZhaopinId(Integer zhaopinId) {
        this.zhaopinId = zhaopinId;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getZhaopinYuyueTime() {
        return zhaopinYuyueTime;
    }
    /**
	 * 设置：申请时间
	 */

    public void setZhaopinYuyueTime(Date zhaopinYuyueTime) {
        this.zhaopinYuyueTime = zhaopinYuyueTime;
    }
    /**
	 * 获取：申请原因
	 */
    public String getZhaopinYuyueText() {
        return zhaopinYuyueText;
    }
    /**
	 * 设置：申请原因
	 */

    public void setZhaopinYuyueText(String zhaopinYuyueText) {
        this.zhaopinYuyueText = zhaopinYuyueText;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getZhaopinYuyueYesnoTypes() {
        return zhaopinYuyueYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setZhaopinYuyueYesnoTypes(Integer zhaopinYuyueYesnoTypes) {
        this.zhaopinYuyueYesnoTypes = zhaopinYuyueYesnoTypes;
    }
    /**
	 * 获取：投递回复
	 */
    public String getZhaopinYuyueYesnoText() {
        return zhaopinYuyueYesnoText;
    }
    /**
	 * 设置：投递回复
	 */

    public void setZhaopinYuyueYesnoText(String zhaopinYuyueYesnoText) {
        this.zhaopinYuyueYesnoText = zhaopinYuyueYesnoText;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ZhaopinYuyue{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", zhaopinId=" + zhaopinId +
            ", zhaopinYuyueTime=" + DateUtil.convertString(zhaopinYuyueTime,"yyyy-MM-dd") +
            ", zhaopinYuyueText=" + zhaopinYuyueText +
            ", zhaopinYuyueYesnoTypes=" + zhaopinYuyueYesnoTypes +
            ", zhaopinYuyueYesnoText=" + zhaopinYuyueYesnoText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
