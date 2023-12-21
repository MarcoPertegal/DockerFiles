FROM node:12.22-alpine as build
WORKDIR /usr/angular
COPY ./package.json .
RUN npm install
COPY . .
RUN npm run build

FROM nginx:alpine 
RUN rm -rf /usr/share/nginx/html/e
COPY --from=angular /home/app/dist/app-name/browser .
EXPOSE 80
