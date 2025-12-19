SELECT m.title
    , ROUND( AVG( r.rating ), 2 ) AS avg_rating
FROM Movies as m
JOIN Ratings as r
ON m.movie_id = r.movie_id
GROUP BY m.title
ORDER BY avg_rating DESC
    , title ASC