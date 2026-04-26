FROM postgres:latest

ENV POSTGRES_DB=jhub_center
ENV POSTGRES_USER=jhub
ENV POSTGRES_PASSWORD=pass
ENV POSTGRES_INIDB_ARGS="--auth-host=scram-sha-256"

EXPOSE 5432

CMD ["postgres"]