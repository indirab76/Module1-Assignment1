SELECT STAFF_NAME,ROUND(MONTHS_BETWEEN(SYSDATE,HIREDATE)) AS MONTHS_WORKED FROM STAFFMASTER ORDER BY MONTHS_WORKED;