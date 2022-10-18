import request from "@/util/axios";

export default async function getTagList() {
    const res = await request({
        methods: 'GET',
        url: 'tag/list'
    })
    return res.data
}