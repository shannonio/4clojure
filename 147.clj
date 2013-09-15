(defn nextrow [row]
  (vec
   (concat
    (take 1 row)
    (map
     #(apply + %)
     (partition 2 1 row))
     (take-last 1 row))))

(nextrow [3 1 2])


(defn pascals [row]
  (iterate (fn nextrow [x]
  (vec (concat
          (take 1 x)
          (map
           #(apply +' %)
           (partition 2 1 x))
          (take-last 1 x))))
           row))

(rest (take 101 (pascals [2 4 2])))

(defn pasctrap [v]
  (let [v1 (concat [0] v)
        v2 (concat v [0])]
    (lazy-seq (cons v (pasctrap (map +' v1 v2))))))

(pasctrap [1])
