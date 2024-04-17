class PersonFactory {
    public static <T, Object> T create(Object entity) {
        if (entity.netWorth > 1000000) {
            return new UpperClass(entity.fullName,
                    entity.occupation,
                    entity.netWorth,
                    entity.ownedCompany);
        }
        if (entity)
    }
}