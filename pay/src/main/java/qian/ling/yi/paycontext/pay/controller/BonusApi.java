package qian.ling.yi.paycontext.pay.controller;

//import infra.common.base.ResponseResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.ws.rs.POST;
//import javax.ws.rs.Path;

/**
 * 红包相关
 */
//@Log
@RestController
//@Path("/v1/p2p/fin/")
//@Scope("prototype")
//@Rollback
public class BonusApi {
//    @Autowired
//    private P2PBonusBiz p2PBonusBiz;

    /**
     * @api {post} /v1/bonus/send  发放产品红包
     * @apiName sendBonus
     * @apiGroup P2P_BONUS
     * @apiVersion 1.0.0
     * @apiDescription P2P发放产品红包
     * @apiParam {Long} userId  用户Id
     * @apiParam {String="XIAODAI1","P2P2"}  platformType  平台来源
     * @apiParam {String} transRecordNo 交易支付订单号
     * @apiParam {String} transNo  交易号
     * @apiParam {String} [terminalId]  终端id
     * @apiParam {String} [osVersion]  系统版本
     * @apiParam {String}  transUserId 转入用户ID
     * @apiParam {BigDecimal} amount 转入金额
     * @apiParam {String="ordinary","big"} tradeType 发送红包类型 ordinary 普通红包,big 大
     * @apiParam {String="1","0" } desFlag 是否使用交易描述(1-使用,0-不使用)
     * @apiParam {String} [des] 交易描述
     * @apiParamExample {json} Request-Example:
     * {
     * "userId": 12312312313,
     * "platformType": "P2P2"，
     * "terminalId": "",
     * "version": "",
     * "transRecordNo": "12312312313",
     * "transNo": "12312312313",
     * "transUserId": "1111111111111",
     * "amount": 156,
     * "tradeType":"big",
     * "desFlag":"0",
     * "des":""
     * }
     * @apiSuccess {String} errorCode
     * @apiSuccess {String} errorMsg
     * @apiSuccess {Map} data
     * @apiSuccess {BigDecimal} data.amount 转入金额
     * @apiSuccess {Long} data.orderNo 支付流水号
     * @apiSuccess {String} data.seqNo 通讯流水号
     * @apiSuccess {String} data.trxDate 通讯日期
     * @apiSuccess {String} data.trxTime 通讯时间
     * @apiSuccessExample Success-ResponseResult:
     * {
     * "errorCode": "0000000",
     * "errorMsg": "success",
     * "succeed": true,
     * "data": {
     * "amount": 123,
     * "orderNo": 12345612313,
     * "seqNo": "123456123133",
     * "trxDate": "20170208",
     * "trxTime": "000001",
     * }
     * }
     **/
    @RequestMapping("/bonus/send")
    public String sendBonus() {
        return "success";
    }
}
