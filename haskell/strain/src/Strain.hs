module Strain (keep, discard) where

neg :: (a -> Bool) -> a -> Bool
neg p x = not (p x)

discard :: (a -> Bool) -> [a] -> [a]
discard p xs = filter (neg p) xs

keep :: (a -> Bool) -> [a] -> [a]
keep p xs = filter p xs


