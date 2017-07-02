import javax.inject.{Inject, Singleton}

import com.affin.chat.util.{FailureFilter, LoggingFilter}
import play.api.http.HttpFilters

@Singleton
class Filters @Inject()(
                         failureFilter: FailureFilter,
                         loggingFilter: LoggingFilter
                       ) extends HttpFilters {
  val filters = Seq(loggingFilter, failureFilter)
}