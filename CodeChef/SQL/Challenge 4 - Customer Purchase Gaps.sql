WITH sorted AS
(
    SELECT customer_id
        , order_date
        , LAG ( order_date ) OVER
        (
            PARTITION BY customer_id
            ORDER BY order_date
        ) AS prev_date
    FROM Orders
)

SELECT sorted.customer_id
    , name
    , MAX( order_date - prev_date ) AS max_gap_days
FROM sorted
NATURAL JOIN Customers
WHERE prev_date IS NOT NULL
GROUP BY customer_id
ORDER BY max_gap_days DESC
    , name ASC
