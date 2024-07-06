import request from '@/utils/request'

// 查询平台动态列表
export function listInformation(query) {
  return request({
    url: '/bid/information/front/list',
    method: 'get',
    params: query
  })
}

// 查询平台动态详细
export function getInformation(id) {
  return request({
    url: '/bid/information/front/' + id,
    method: 'get'
  })
}

