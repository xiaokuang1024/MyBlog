import {createStore} from "vuex";
import getSetting from "@/api/setting";
import getWordCountList from "@/api/word";
import getMoment from "@/api/moments";
import getTagList from "@/api/tags";
import getFriends from "@/api/friends";

let actions = {}

let mutations = {}

let state = {
    setting: '',
    wordCountList: '',
    moments: '',
    tagList: '',
    friends: '',
}

getSetting().then(res => state.setting = res.data)
getWordCountList().then(res => state.wordCountList = res.data)
getMoment().then(res => state.moments = res.data)
getTagList().then(res => state.tagList = res.data)
getFriends().then(res => state.friends = res.data)


let store = createStore({
    actions, mutations, state
})


export default store