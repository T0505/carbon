<template>
  <div class="list">
    <el-breadcrumb separator="/" class="breadcrumb">
      <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
      <el-breadcrumb-item>动态列表页</el-breadcrumb-item>
    </el-breadcrumb>
    <div class="content">
      <el-table class="bidTable" v-loading="loading" style="width: 100%" :data="informationList" :header-cell-style="{
      background:'#F6FDFD',height:'46px',color:'#000000',border: '0px solid tan', boxShadow: 'inset 0px -1px 0px 0px #EEEEEE'}"
                :row-style="{height:'50px'}"
                @row-click="handleTableRow"
      >
        <el-table-column label="序号" type="index" width="244"></el-table-column>
        <el-table-column label="动态标题" align="left" width="530" prop="title"/>
        <el-table-column label="发布时间" align="left" prop="publishDatetime">
          <template slot-scope="scope">
            <span>{{ parseTime(scope.row.publishDatetime, '{y}-{m}-{d}') }}</span>
          </template>
        </el-table-column>
      </el-table>
      <div ref="mobileList" class="mobileList">
        <div class="mobile_item" v-for="(item,index) in informationList" :key="index" @click="handleTableRow(item)">
          <h4>{{ item.title }}</h4>
          <span>{{ parseTime(item.publishDatetime, '{y}-{m}-{d}') }}</span>
        </div>
      </div>
      <pagination
        class="bidPagination"
        v-show="total>0"
        :total="total"
        :page.sync="queryParams.pageNum"
        :limit.sync="queryParams.pageSize"
        @pagination="getList"
      />
    </div>

  </div>
</template>

<script>
import {listInformation} from '@/api/bid/information'

export default {
  name: "list",
  data() {
    return {
      loading: true,
      // 总条数
      total: 0,
      informationList: [],
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 20,
      },
      headerCellClassName: 'headerClass'
    }
  },
  mounted() {
    this.getList();
  },
  methods: {
    getList() {
      const that = this
      this.loading = true
      if(this.$refs.mobileList.offsetTop > 0) {
        this.queryParams = {};
      }
      listInformation(this.queryParams).then(response => {
        this.informationList = response.rows
        this.total = response.total
        this.loading = false
      })
    },
    handleTableRow(row, column, event) {
      this.$router.push(`/info/detail?id=${row.id}`)
    }
  }
}
</script>

<style lang="scss" scoped>
.list {
  .breadcrumb {
    height: 21px;
    font-family: MicrosoftYaHei, sans-serif;
    font-size: 14px;
    font-weight: normal;
    line-height: 21px;
    letter-spacing: 0em;
    margin-left: 30px
  }

  .content {
    margin: 14px 30px 44px 30px;
    background: #FFFFFF;
    border-radius: 10px;
    opacity: 1;
    width: 1380px;
    min-height: 860px;
    padding: 24px 21px 0 21px;
  }
}
.mobileList{
  display: none;
  text-align: left;
  .mobile_item{
    margin-bottom: 10px;
    padding-bottom: 10px;
    border-bottom: 1px #e6e6e6 solid;

    h4{
      margin: 0;
      padding-bottom: 5px;
    }

    span{
      font-size: 14px;
      color: #888;
    }
  }
}

.headerClass {

  background: #F6FDFD;

  box-shadow: inset 0px -1px 0px 0px #EEEEEE;
}

::v-deep .pagination-container .el-pagination {
  text-align: center;
  margin-top: 20px;
  display: flex;
  justify-content: center;
  position: relative;
}

::v-deep .el-pager li.active {

  cursor: default;
  font-family: MicrosoftYaHei, sans-serif;
  font-size: 12px;
  font-weight: normal;

  letter-spacing: 0em;
  color: #1DD0B7;
}

@media screen and (max-width: 767px){
  .list{
    .breadcrumb{
      margin-left: 0;
    }
    .content{
      width: 100%;
      margin: 14px 0 44px 0;
      min-height: auto;
    }
  }

  .mobileList{
    display: block;
  }

  .bidTable,.bidPagination{
    display: none;
  }
}
</style>
