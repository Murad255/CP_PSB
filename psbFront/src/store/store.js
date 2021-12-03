import Vue from 'vue'
import Vuex from 'vuex'
import VuexPersistence from 'vuex-persist';
Vue.use(Vuex);
const vuexPersistence = new VuexPersistence({
    storage: window.localStorage,
});
export default new Vuex.Store({
    state: {
        user: null,
        navigation: { path: '/home' },
        arf:[0,0,0,0,0,0,0,0,0,0,0,0],
        qCards: [
            {
                id:1,
                txt: [
                    "отметка о выполнении руководителем или наставником",
                    "отметка новым сотрудникам"
                ],
                isChecked: 0,
                headr: "Подписание трудового договора",
                imgs: [
                    "note.svg",
                    "chain.png",

                ]
            },
            {
                id:2,
                txt: [
                    "отметка о выполнении руководителем или наставником",
                    "отметка новым сотрудникам"
                ],
                isChecked: 0,
                headr: "Получение welcome pack",
                imgs: [
                    "pen.png",
                    "people.png",

                ]
            },
            {
                id:3,
                txt: [
                    "отметка о выполнении руководителем или наставником",
                    "отметка новым сотрудникам",
                    "заполняется руководителем или наствником",
                    "e-mail"
                ],
                isChecked: 0,
                headr: "Отправка плана на адаптацию в виде таймлайна",
                imgs: [
                    "pen.png",
                    "people.png",

                ]
            },
            {
                id:4,
                txt: [
                    "отметка о выполнении руководителем или наставником",
                    "заполняется руководителем или наствником",
                    "e-mail"
                ],
                isChecked: 0,
                headr: "Отправка данных о местоположении",
                imgs: [
                    "pen.png",
                    "people.png",

                ]
            },
            {
                id:5,
                txt: [
                    "отметка о выполнении руководителем или наставником",
                    "заполняется руководителем или наствником",
                    "e-mail"
                ],
                isChecked: 0,
                headr: "Отправка контактов встечающего",
                imgs: [
                    "pen.png",
                    "people.png",

                ]
            },
            {
                id:6,
                txt: [
                    "отметка о выполнении руководителем или наставником",
                    "заполняется руководителем или наствником",
                    "опрос",
                    "e-mail"
                ],
                isChecked: 0,
                headr: "Опрос по результатам приёма",
                imgs: [
                    "note.svg",
                    "chain.png",

                ]
            },
            {
                id:7,
                txt: [
                    "отметка автоматически по результату",
                    "заполняется руководителем или наствником",
                    "e-mail"
                ],
                isChecked: 0,
                headr: "Назначение наставника и знакомство",
                imgs: [
                    "note.svg",
                    "chain.png",

                ]
            },
            {
                id:8,
                txt: [
                    "выполняется руководителем или наставником",
                    "отметка новым сотрудникам",
                ],
                isChecked: 0,
                headr: "Знакомство с офисом",
                imgs: [
                    "pen.png",
                    "people.png",

                ]
            },
            {
                id:9,
                txt: [
                    "заполняется руководителем или наставником",
                    "отметка новым сотрудникам",
                ],
                isChecked: 0,
                headr: "Ознакомление с должностной инструкцией",
                imgs: [
                    "pen.png",
                    "people.png",

                ]
            },
            {
                id:10,
                txt: [
                    "отметка новым сотрудникам",
                    "ссылка на ресурс"
                ],
                isChecked: 0,
                headr: "Прохождение обязательного инструктажа",
                imgs: [
                    "pen.png",
                    "people.png",

                ]
            },
            {
                id:11,
                txt: [
                    "заполняется руководителем или наставником",
                    "выполняется руководителем или наставником",
                    "отметка о выполнении руководителем или наставником",
                ],
                isChecked: 0,
                headr: "Оформление базовых доступов",
                imgs: [
                    "note.svg",
                    "chain.png",
                ]
            },
            {
                id:12,
                txt: [
                    "отметка о выполнении руководителем или наставником",
                    "заполняется руководителем или наставником",
                    "отметка новым сотрудникам",
                    "выполняется руководителем или наставником",
                ],
                isChecked: 0,
                headr: "Доступы в площадкам разработки и тестирование",
                imgs: [
                    "note.svg",
                    "chain.png",

                ]
            }
        ],
    },
    mutations:{
        setUser (state,user) {
            state.user=user;
        },
        setC(state){
            state.qCards =[
                {
                    id:1,
                    txt: [
                        "Отметка о выполнении"
                    ],
                    isChecked: 0,
                    headr: "Подписание трудового договора",
                    imgs: [


                    ]
                },
                {
                    id:2,
                    txt: [
                        "Заполняется на портале"
                    ],
                    isChecked: 0,
                    headr: "Увлечения",
                    imgs: [
                        "pen.png",
                    ]
                },
                {
                    id:3,
                    txt: [
                        "Ссылка на ресурс",
                        "Отметка новым сотрудникам",
                    ],
                    isChecked: 0,
                    headr: "Изучение процесса работы",
                    imgs: [
                        "сhain.png"
                    ]
                },
                {
                    id:4,
                    txt: [
                        "Опроc"
                    ],
                    isChecked: 0,
                    headr: "Опрос по изученному материалу",
                    imgs: [
                        "note.svg",

                    ]
                },
                {
                    id:5,
                    txt: [
                        "Ссылка на ресурс"
                    ],
                    isChecked: 0,
                    headr: "Возможности, предоставляемые банком",
                    imgs: [
                        "chain.png",

                    ]
                },
                {
                    id:6,
                    txt: [
                        "Ссылка на ресурс"
                    ],
                    isChecked: 0,
                    headr: "Эксплуатационная документация",
                    imgs: [
                        "chain.png",

                    ]
                },
                {
                    id:7,
                    txt: [
                        "Встреча",
                        "заполняется руководителем или наствником",
                        "e-mail"
                    ],
                    isChecked: 0,
                    headr: "План на испытательный срок",
                    imgs: [
                        "chain.png",
                        "people.png",

                    ]
                },
                {
                    id:8,
                    txt: [
                        "выполняется руководителем или наставником",
                        "отметка новым сотрудникам",
                    ],
                    isChecked: 0,
                    headr: "X",
                    imgs: [
                        "chain.png",

                    ]
                },
                {
                    id:9,
                    txt: [
                        "заполняется руководителем или наставником",
                        "отметка новым сотрудникам",
                    ],
                    isChecked: 0,
                    headr: "Ознакомление с должностной инструкцией",
                    imgs: [
                        "chain.png",

                    ]
                },
                {
                    id:10,
                    txt: [
                        "ссылка на ресурс"
                    ],
                    isChecked: 0,
                    headr: "Что тебе доступно в банке",
                    imgs: [
                        "chain.png",

                    ]
                }
            ]
        },
        setCard (state,card) {
            for(let i=0;i<12;i++){
                if(card.id === state.qCards[i].id){
                    state.qCards[i] = card;
                    break;
                }
            }
        },
        dropUser(state){
            state.user=null;
        }
    },
    plugins: [vuexPersistence.plugin]
})