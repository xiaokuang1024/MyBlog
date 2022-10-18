import {createStore} from "vuex";
import getSetting from "@/api/setting";
import getMoment from "@/api/moments";
import getFriends from "@/api/friends";
import getTagList from "@/api/tags";
import getWordCountList from "@/api/word";

const actions = {}

const mutations = {}

const state = {
    setting: {},
    moment: [],
    friends: [],
    tagList: [],
    WordCountList: [],
}

getSetting().then(res => {
    state.setting = res.data
})

getMoment().then(res => {
    state.moment = res.data
})

getFriends().then(res => {
    state.friends = res.data
})

getTagList().then(res => {
    state.tagList = res.data
})

getWordCountList().then(res => {
    state.WordCountList = res.data
})

const store = createStore({
    actions, mutations, state
})


export default store