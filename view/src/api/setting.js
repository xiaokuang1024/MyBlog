import request from "@/util/axios";

export default async function getSetting() {
    const res = await request({
        methods:'GET',
        url:'setting'
    })
    return res.data
}