FROM node:lts-alpine3.22

WORKDIR /app

COPY package*.json ./

COPY src ./src

COPY public ./public

COPY tsconfig.json ./

EXPOSE 3000

RUN npm install

RUN npm start


