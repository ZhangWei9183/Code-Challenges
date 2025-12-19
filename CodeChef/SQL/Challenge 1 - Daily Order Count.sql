SELECT order_date
    , COUNT( amount ) AS total_orders
FROM Orders
GROUP BY order_date