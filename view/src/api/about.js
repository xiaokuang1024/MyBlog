import request from "@/util/axios";

export default async function getAbout() {
    const res = await request({
        methods:'GET',
        url:'about'
    })
    return res.data
}