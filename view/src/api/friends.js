import request from "@/util/axios";

export default async function getFriends() {
    const res = await request({
        methods:'GET',
        url:'friends'
    })
    return res.data
}