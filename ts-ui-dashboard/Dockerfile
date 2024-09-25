FROM openresty/openresty:1.21.4.1-0-alpine

COPY nginx.conf /usr/local/openresty/nginx/conf/nginx.conf
COPY static /usr/share/nginx/html
EXPOSE 8080
CMD ["/usr/local/openresty/bin/openresty", "-g", "daemon off;"]
