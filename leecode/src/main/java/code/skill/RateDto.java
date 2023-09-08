package code.skill;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-09-06 14:57
 * @description：
 */
public abstract class RateDto {

    private String riskCode;

    private String period;

    private String payYear;

    private String insuredAge;

    private String rate;

    private String startDate;

    private String operator;

    public  <T extends RateDto> String vaildRiskCode(List<T> list, String riskCodeTarget){
        //---校验行数据相同todo
        if(!(list != null || list.size()>0)){
            return "列表为空";
        }
        Set<String> riskCodeSet = list.stream().map(RateDto::getRiskCode).collect(Collectors.toSet());
        if(riskCodeSet.size()!=1){
            return "同一批次导入产品编码不能为空且应该保持一致";
        }else if(!riskCodeSet.contains(riskCodeTarget)){
            return "产品编码与所选产品不符";
        }
        //从数据库中取数据进行校验。
        return "当前产品不存在或者未上线";
    }

    public  <T extends RateDto> String vaildInsuranceFactor(List<T> list){
        int index = 2;
        StringBuilder resultLine = new StringBuilder("");
        StringBuilder result = new StringBuilder("");
        for (RateDto rateDto :list){
            if(StringUtils.isBlank(rateDto.getRiskCode())){
                resultLine.append("产品编码不能为空,");
            }
            if(StringUtils.isBlank(rateDto.getPeriod())){
                resultLine.append("保障期间不能为空,");
            }
            if(StringUtils.isBlank(rateDto.getPayYear())){
                resultLine.append("缴费期间不能为空,");
            }
            if(StringUtils.isNotBlank(resultLine)){
                result.append("第")
                        .append(index)
                        .append("行")
                        .append(resultLine)
                        .append(";");
                resultLine = new StringBuilder("");
            }
            index++;
        }
        return result.toString();
    }


    public <T extends RateDto> String vaildRate(List<T> list){
        int index = 2;
        StringBuilder resultLine = new StringBuilder("");
        StringBuilder result = new StringBuilder("");
        for (RateDto rateDto :list){
            String rate = rateDto.getRate();
            if(StringUtils.isBlank(rate)){
                resultLine.append("手续费率不能为空,");
            }else {
                //去掉百分号 判断大于等于0 和最多两位小数
            }
            if(StringUtils.isNotBlank(resultLine)){
                result.append("第")
                        .append(index)
                        .append("行")
                        .append(resultLine)
                        .append(";");
                resultLine = new StringBuilder("");
            }
            index++;
        }
        return result.toString();
    }
    public <T> void vaildStartDate(List<T> list){
        //生效日期校验，直接从applicationContext中去除bean对象进行校验。
        //有问题直接抛出异常
    }
    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPayYear() {
        return payYear;
    }

    public void setPayYear(String payYear) {
        this.payYear = payYear;
    }

    public String getInsuredAge() {
        return insuredAge;
    }

    public void setInsuredAge(String insuredAge) {
        this.insuredAge = insuredAge;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
