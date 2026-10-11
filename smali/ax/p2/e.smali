.class public final synthetic Lax/p2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:Lax/o2/h$a;

.field public final synthetic b:Lax/p2/d$b;


# direct methods
.method public synthetic constructor <init>(Lax/o2/h$a;Lax/p2/d$b;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/p2/e;->a:Lax/o2/h$a;

    iput-object p2, p0, Lax/p2/e;->b:Lax/p2/d$b;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/p2/e;->a:Lax/o2/h$a;

    iget-object v1, p0, Lax/p2/e;->b:Lax/p2/d$b;

    invoke-static {v0, v1, p1}, Lax/p2/d$c;->a(Lax/o2/h$a;Lax/p2/d$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
