WITH total_quantity AS
(
    SELECT category
        , product_name
        , SUM( quantity ) AS total_sold
    FROM Products
    NATURAL JOIN OrderItems
    GROUP BY product_id
)

, max_quantity AS
(
    SELECT category
        , MAX( total_sold ) as max_sold
    FROM total_quantity
    GROUP BY category
)

SELECT max_quantity.category
    , product_name
    , total_sold
FROM total_quantity
JOIN max_quantity ON total_quantity.category = max_quantity.category
WHERE total_sold = max_sold
ORDER BY max_quantity.category
    , product_name