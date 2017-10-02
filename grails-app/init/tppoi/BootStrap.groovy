package tppoi

class BootStrap {

    def init = { servletContext ->

        def roleUtilisateur = new Role(authority: "ROLE_USER").save(flush :true , failOnError : true)
        def roleModelateur = new Role(authority: "ROLE_ANNOUNCER").save(flush : true , failOnError : true)
        def roleAdministrateur = new Role(authority: "ROLE_ADMIN").save(flush : true , failOnError : true)

        def utilisateur = new User(username: "teddy", password: ("teddy")).save(flush : true , failOnError :true)
        def modelateur = new User(username: "hugues" , password: ("hugues")).save(flush : true , failOnError : true)
        def adminstrateur = new User(username: "kwizera", password: ("kwizera")).save(flush : true , failOnError : true)

        UserRole.create(utilisateur , roleUtilisateur , true)
        UserRole.create(modelateur , roleModelateur , true)
        UserRole.create(adminstrateur , roleAdministrateur , true)

    }
    def destroy = {
    }
}
