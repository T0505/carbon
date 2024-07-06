import request from '@/utils/request'


// 查询设备信息详细
export function getEquipmentInfo(id) {
  return request({
    url: '/baseInfo/equipmentInfo/' + id,
    method: 'get'
  })
}

