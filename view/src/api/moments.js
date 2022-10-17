import request from "@/util/axios";

export default async function getMoment() {
    const res = await request({
        methods:'GET',
        url:'moment'
    })
    return res.data
}