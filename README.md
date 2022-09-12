# 🖥 DSMeta

> Aplicação criada em monorepo, usando o JavaScript com ReactJS no frontend e Java com Spring Framework no backend com objetivo de estudo das linguagens da Semana Spring React da [DevSuperior](https://www.instagram.com/p/CiAy1OwOqR-/)

| PC   | Smartphone | tablet   |
|:--------:|:---------:|:--------:|
| ![painel](https://github.com/Fledson/dsmeta/blob/main/img/pc.png?raw=true) | ![painel](https://github.com/Fledson/dsmeta/blob/main/img/smatphone.png?raw=true) | ![painel](https://github.com/Fledson/dsmeta/blob/main/img/tablet.png?raw=true) |


| GIF   | SMS | 
|:--------:|:---------:|
| ![gif](https://github.com/Fledson/dsmeta/blob/main/img/animation.gif?raw=true) | ![gif](https://github.com/Fledson/dsmeta/blob/main/img/animation.gif?raw=true) |

## 🧑‍💻 Deploy 👩‍💻 

- [Frontend no netlify](https://dsmeta-fledson.netlify.app/)
- [Backend Api no heroku](https://dsmeta-fledson.herokuapp.com/sales)

## 💻 Tecnologias usadas
- ☕️ [Linguagem de Programação Java](https://docs.oracle.com/en/java/)
- 🍃 [Spring Framework](http://spring.io/)
- 💡 [JavaScript](https://www.javascript.com/)
- ⚛️ [React](https://pt-br.reactjs.org/)
- 🎲 [H2 Database](https://www.h2database.com/html/main.html)
- 🔌 [Axios](https://axios-http.com/)
- 🎛️ [Twilio](https://www.twilio.com/pt-br/)
- 🟣 [Heroku](https://www.heroku.com/)
- 🔵 [Netlify](https://www.netlify.com/)

## 📌 Implementações
----------
### Frontend
  - 📅 Filtro de datas usando Datepicker
  - 📜 Listagem de Vendas 
  - 📨 Envio de notificação
  - ⚠️ Toast de Aviso de notificação enviada
----------
### Backend
  - [** Rota de Vendas **](https://dsmeta-fledson.herokuapp.com/sales)
    - 📜 Listagem de clientes por data (pega data atual e 1 ano atras se nenhuma data for passada)
  
  - ** Rota de Notificação **
    - 📨 Envio de notificação via SMS usando a dependencia do Twilio
----------
