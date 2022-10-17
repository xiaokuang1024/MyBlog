import {createRouter, createWebHistory} from "vue-router"

const routes = [
    {
        path: '/',
        redirect: '/home'
    },
    {
        path: '/home',
        component: () => import('@/view/Home.vue'),
        children: [
            {
                path: '/home',
                component: () => import('@/view/home/Home.vue')
            },
            {
                path: '/category',
                component: () => import('@/view/category/Category.vue')
            },
            {
                path: '/moments',
                component: () => import('@/view/moments/Moments.vue')
            },
            {
                path: '/friends',
                component: () => import('@/view/friends/Friends.vue')
            },
            {
                path: '/about',
                component: () => import('@/view/about/About.vue')
            },
            {
                path: '/word',
                component: () => import('@/view/word/WordCount.vue')
            }, {
                path: '/tag',
                component: () => import('@/view/tags/Tag.vue')
            }
        ]
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes: routes
})

export default router