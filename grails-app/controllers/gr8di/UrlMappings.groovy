package gr8di

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
        "/home"(view:"/home")
        "/about"(view:"/about")
        "/sponsors"(view:"/sponsors")
    }
}
