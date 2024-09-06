package com.webank.wedpr.components.report.handler;

import java.util.List;
import lombok.Data;
import lombok.ToString;

/** Created by caryliao on 2024/9/5 11:28 */
@Data
@ToString
public class JobReportResponse {
    private Integer code;
    private String msg;
    private List<String> jobIdList;
}