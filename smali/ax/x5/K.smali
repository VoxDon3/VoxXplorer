.class public final synthetic Lax/x5/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x5/M$b;


# instance fields
.field public final synthetic a:Lax/x5/M;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lax/x5/M;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/x5/K;->a:Lax/x5/M;

    iput-object p2, p0, Lax/x5/K;->b:Ljava/lang/String;

    iput-object p3, p0, Lax/x5/K;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/x5/K;->a:Lax/x5/M;

    iget-object v1, p0, Lax/x5/K;->b:Ljava/lang/String;

    iget-object v2, p0, Lax/x5/K;->c:Ljava/lang/String;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lax/x5/M;->p(Lax/x5/M;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
