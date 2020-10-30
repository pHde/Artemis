# TODO
- Fix generics in `Similarity` (reduce casts, better method parameters).
- Remove duplicated code, introduce superclasses for common element behavior
- Improve performance (maps instead of list iteration e.g., reduce the number of loops)
- Fix redundant equals implementations
- Make `UMLModelParser` better readable (split it up, remove code duplication)
- Check if `ModelIndex` needs to respect the distributed architecture (-> Hazelcast)
- Replace `IOException` by something more sensible
- Take care of `null` in the parser