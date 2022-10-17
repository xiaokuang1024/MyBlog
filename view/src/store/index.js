import {createStore} from "vuex";
import getSetting from "@/api/setting";
import getMoment from "@/api/moments";

const actions = {}

const mutations = {}

const state = {
    setting: {},
    moment: []

}

getSetting().then(res => {
    state.setting = res.data
})

getMoment().then(res => {
    state.moment = res.data
})

const store = createStore({
    actions, mutations, state
})


export default store