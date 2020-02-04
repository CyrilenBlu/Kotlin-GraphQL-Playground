FROM rabbitmq:3-management
MAINTAINER lukepetzerint2@gmail.com
ENV RABBITMQ_DEFAULT_USER blurabbit
ENV RABBITMQ_DEFAULT_PASS blurabbit
EXPOSE 5672 5672
EXPOSE 15672 15672
#untested