#!/bin/bash

user=root
sql_script_dir=.
database=people

echo "Recreating database: $database"
mysql -u $user < ${sql_script_dir}/create_db.sql

echo "Recreating tables"
mysql -u $user $database < ${sql_script_dir}/create_tables.sql

echo "Inserting Data"
mysql -u $user $database < ${sql_script_dir}/insert_data.sql