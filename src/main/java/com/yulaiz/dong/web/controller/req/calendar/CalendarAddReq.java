package com.yulaiz.dong.web.controller.req.calendar;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by YuLai on 2018/1/18.
 */
@Data
public class CalendarAddReq implements Serializable {

    private static final long serialVersionUID = -5139640489307730235L;

    @ApiModelProperty("日历天数，格式：yyyy-MM-dd HH:mm:ss")
    @NotNull(message = "日历天数不能为空")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date days;

    @ApiModelProperty("日历标题")
    @NotBlank(message = "标题不能为空")
    private String title;

    @ApiModelProperty("日历描述")
    @NotBlank(message = "描述不能为空")
    private String description;

    @ApiModelProperty("日历备注")
    private String remark;
}
