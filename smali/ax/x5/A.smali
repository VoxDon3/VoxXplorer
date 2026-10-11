.class public final synthetic Lax/x5/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x5/M$b;


# instance fields
.field public final synthetic a:Lax/x5/M;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lax/s5/a$a;


# direct methods
.method public synthetic constructor <init>(Lax/x5/M;Ljava/util/Map;Lax/s5/a$a;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/x5/A;->a:Lax/x5/M;

    iput-object p2, p0, Lax/x5/A;->b:Ljava/util/Map;

    iput-object p3, p0, Lax/x5/A;->c:Lax/s5/a$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/x5/A;->a:Lax/x5/M;

    iget-object v1, p0, Lax/x5/A;->b:Ljava/util/Map;

    iget-object v2, p0, Lax/x5/A;->c:Lax/s5/a$a;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lax/x5/M;->F(Lax/x5/M;Ljava/util/Map;Lax/s5/a$a;Landroid/database/Cursor;)Lax/s5/a;

    move-result-object p1

    return-object p1
.end method
