import * as API from "../api";

export const paramType = {
    'big1': "/carbonReport/emissionChart/percent", //能耗占比
    'big2': "/carbonReport/productPowerReport/year", //能耗总览 
}
/******************      通用增删改查       ********************* */

/**
 * 通用GET
 * @param {*} param 
 */
export const currentGET = (key, param) => {
    return API.GET(paramType[key], param)
}

// 通用接口集合
export const currentApi = {
    currentGET
}