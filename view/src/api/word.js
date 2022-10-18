import request from "@/util/axios";

export default async function getWordCountList() {
    const res = await request({
        methods: 'GET',
        url: 'word/count'
    })
    return res.data
}