<template>
  <div class="t-table">
    <table class="table">
      <thead class="thead">
      <tr class="table-tr">
        <th v-for="title of titleArray">
          {{ title }}
        </th>
      </tr>
      </thead>
      <tbody class="tbody">
      <tr class="table-tr" v-for="index of tableData.length">
        <td v-for="title of titleArray">
          <div>{{ tableData[index-1][title] }}</div>
        </td>
      </tr>
      </tbody>
    </table>
    <div v-show="false">
      <slot></slot>
    </div>
  </div>
</template>

<script>
export default {
  name: "t-table",
  props: {
    tableData: {
      type: Array,
      default: [],
    }
  },
  data() {
    return {
      titleArray: [],
    }
  },
  mounted() {
    this.getTableTitleList();
  },
  methods: {
    /**
     * 获取标题列表
     **/
    getTableTitleList() {
      let titleList = [];
      for (let element of this.$children) {
        titleList.push(element.title);
      }
      this.titleArray = titleList;
    }
  },
};
</script>

<style scoped lang="less">
.t-table {
  table {
    width: 100%;

    .thead .tbody {
      width: 100%;
    }

    .table-tr {
      display: flex;
      width: 100%;
      justify-content: space-between;
    }
  }

}

</style>